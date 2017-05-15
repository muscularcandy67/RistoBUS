package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public class MyMenuManager implements MenuManager {

	/**
	 * Default constructor
	 */
	public MyMenuManager() {
            
	}

    @Override
    public ArrayList<Menu> caricaMenu(HashMap<Categoria, ArrayList<Portata>> mm) {
        File f = new File("Menu.txt");
        ArrayList<Menu> menus = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            String nomemenu = null;
            Menu m = null;
            while ((line = br.readLine()) != null) {
                Categoria c = null;
                if (line.startsWith("MENU")) {
                    HashMap<Categoria, ArrayList<Portata>> hm = new HashMap<>();
                    m = new Menu(line.substring(5), hm);
                } else if (line.startsWith("ANTIPASTO")) {
                    c = Categoria.ANTIPASTO;
                } else if (line.startsWith("PRIMO")) {
                    c = Categoria.PRIMO;
                } else if (line.startsWith("SECONDO")) {
                    c = Categoria.SECONDO;
                } else if (line.startsWith("DESSERT")) {
                    c = Categoria.DESSERT;
                } else if (line.startsWith("END MENU")) {
                    menus.add(m);
                }
                ArrayList<Portata> p = m.getPortate(c);
                MyPortateManager mpm = new MyPortateManager();
                p.add(mpm.findPortataByID(line.substring(line.indexOf(": ")+1)));
                //m.setPortate(mm)
                
            }
        } catch(IOException ioex) {
            ioex.printStackTrace();
        }
        System.out.println(menus);
    }

    @Override
    public void salvaMenu(Menu m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean putInHashMap(HashMap<Categoria, ArrayList<Portata>> hm, Categoria c, String str) {
        StringTokenizer st = new StringTokenizer(str);
        ArrayList<Portata> alp = hm.get(c);
        MyPortateManager mpm = new MyPortateManager();
        for (int i=0;i<st.countTokens();i++) {
            String strnt = st.nextToken();
            Portata p = mpm.findPortataByID(strnt);
            if (p != null) {
                alp.add(p);
            }
        }
        hm.put(c, alp);
        return true;
    }
        
        

}