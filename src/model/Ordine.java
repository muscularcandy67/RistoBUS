package model;

import java.util.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 *
 * @author Iskandar Montano
 */
public class Ordine {

    private String nomeCliente;
    private HashMap<Categoria, ArrayList<Portata>> portate;
    private Menu menu;

    public Ordine(String nomeCliente, Menu menu) {
        setNomeCliente(nomeCliente);
        setMenu(menu);
    }

    public Map<Categoria, ArrayList<Portata>> getElencoPortate() {
        return portate;
    }

    public void aggiungiPortata(Portata p) {
        ArrayList<Portata> portatee = portate.get(p.getCategoria());
        portatee.add(p);
        portate.put(p.getCategoria(), portatee);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public boolean setNomeCliente(String nomeCliente) {
        if (nomeCliente != null && !nomeCliente.isEmpty()) {
            this.nomeCliente = nomeCliente;
            return true;
        } else {
            return false;
        }
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        if(menu!=null){
         this.menu=menu;
        }
    }

    public Map<Categoria,ArrayList<Portata>> getPortate() {
        return portate;
    }

    public void setPortate(HashMap<Categoria,ArrayList<Portata>> portate) {
        this.portate = portate;
    }
    
    public boolean isValid() {
        int x = 0;
        for (Categoria c : Categoria.values()) {
            if (portate.get(c).size()>0) x++;
        }
        return x==4;
    }

    public double getPrezzoTotale() {
        double prezzotot = 0;
        for (Categoria c : Categoria.values()) {
            for (Portata p : portate.get(c)) {
                prezzotot += p.getPrezzo();
            }
        }
        return prezzotot;
    }

    @Override
    public String toString() {
        return this.getNomeCliente() + " (€" + this.getPrezzoTotale() + ")";
    }
    
    public String toFullString() {
        String ret = this.toString() + "\n";
        for (Categoria c : Categoria.values()) {
            for (Portata p : portate.get(c)) {
                ret += p.toString() + "\n";
            }
        }
        return ret;
    }

}
