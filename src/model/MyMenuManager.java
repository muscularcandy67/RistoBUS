package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public class MyMenuManager implements MenuManager {

	
    /** Formato menu
     * 
     *  MENU base
     *  ANTIPASTO: A01, A02
     *  PRIMO: P02, P04
     *  SECONDO: S03, S05
     *  DESSERT: D01
     *  END MENU
     * 
    **/
    
    
    @Override
    public ArrayList<Menu> caricaMenu(HashMap<Categoria, ArrayList<Portata>> mm) { // mm viene da MyPortateManager e contiene il database di portate disponibili
        File f = new File("Menu.txt");
        ArrayList<Menu> menus = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            Menu m = null;
            while ((line = br.readLine()) != null) {
                Categoria c = null;
                if (line.startsWith("MENU")) {
                    m = new Menu(line.substring(5));
                } else if (line.startsWith("END MENU")) {
                    menus.add(m);
                } else {
                    c = Categoria.valueOf(line.substring(0,line.indexOf(":")));
                    //System.out.println(c);
                    String str = line.substring(line.indexOf(": ")+1);
                    StringTokenizer st = new StringTokenizer(str, ",");
                    ArrayList<String> portatestr = new ArrayList<>();
                    while (st.hasMoreTokens()) {
                        String token = st.nextToken().trim();
                        //System.out.println(token);
                        portatestr.add(token);
                        //System.out.println(portatestr);
                    }
                    
                    ArrayList<Portata> portate = new ArrayList<>();
                    for (String strport : portatestr) {
                        //System.out.println(strport);
                        Portata p = findPortataById(strport, mm);
                        if (p != null) {
                            portate.add(p);
                        } else {
                            //System.out.println(p + " is null!");
                        }
                    }
                
                    m.setPortate(c, portate);
                }
                
            }
        } catch(IOException ioex) {
            ioex.printStackTrace();
        }
        //System.out.println(menus);
        return menus;
    }

    @Override
    public void salvaMenu(Menu m) {
        MyPortateManager mpm = new MyPortateManager();
        ArrayList<Menu> old_menu = this.caricaMenu(mpm.caricaPortate());
        old_menu.add(m);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Menu.txt")));
            String buffer = "";
            for (Menu menu : old_menu) {
                buffer += menu.toFileFormat() + "\n";
            }
            bw.write(buffer);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static Portata findPortataById(String id, HashMap<Categoria, ArrayList<Portata>> mm) {
        for (Categoria c : Categoria.values()) {
            //System.out.println(c);
            for (Portata p : mm.get(c)) {
                //System.out.println(p.getID() + " =? " + id);
                if (p.getID().equals(id)) {
                    System.out.println(p);
                    return p;
                } 
            }
        }
        return null;
    }
        
        

}
