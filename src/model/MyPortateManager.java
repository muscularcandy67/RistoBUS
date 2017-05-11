package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class MyPortateManager implements PortateManager {


    /*
     * Default constructor    public MyPortateManager() {

     */
    public MyPortateManager() {

    }

    @Override
    public HashMap caricaPortate() {
        HashMap<Categoria, ArrayList<Portata>> hm = new HashMap<>();
        hm.put(Categoria.ANTIPASTO, new ArrayList<>());
        hm.put(Categoria.PRIMO, new ArrayList<>());
        hm.put(Categoria.SECONDO, new ArrayList<>());
        hm.put(Categoria.DESSERT, new ArrayList<>());
        File f = new File("Portate.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");
                if (st.countTokens() == 4) {
                    String id = st.nextToken().trim();
                    String nome = st.nextToken().trim();
                    ArrayList<Portata> al;
                    Categoria key = null;
                    String cat = st.nextToken().trim();
                    switch (cat) {
                        case "ANTIPASTO":key = Categoria.ANTIPASTO;
                                          break;
                        case "PRIMO": key = Categoria.PRIMO;
                                      break;
                        case "SECONDO": key = Categoria.SECONDO;
                                      break;
                        case "DESSERT": key = Categoria.DESSERT;
                                      break;
                    }
                    double prezzo = Double.parseDouble(st.nextToken());
                    al = hm.get(key);
                    System.out.println(key + id + nome + prezzo);
                    al.add(new Portata(key, id, nome, prezzo));
                    hm.put(key, al);
                } else {
                    System.err.println("NOT ENOUGH TOKENS! Format error :(");
                }
            }
        } catch(IOException ioex) {
            ioex.printStackTrace();
        }

        return hm;
    }

    @Override
    public void salvaPortata(Portata p) {
        try {
            HashMap<Categoria, ArrayList<Portata>> hm = this.caricaPortate();
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Portate.txt")));
            String portate = "";
            for (Categoria cat : Categoria.values()) {
                for (Portata portata : hm.get(cat)) {
                    portate += portata.toFileFormat() + "\n";
                }
                if (p.getCategoria() == cat) {
                    portate += p.toFileFormat() + "\n";
                }
            }
            System.out.println(portate);
            bw.write(portate);
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(MyPortateManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
