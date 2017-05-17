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
    private HashMap<Categoria, Portata> portate;
    private Menu menu;

    public Ordine(String nomeCliente, Menu menu) {
        setNomeCliente(nomeCliente);
        setMenu(menu);
    }

    public Map<Categoria, Portata> getElencoPortate() {
        return portate;
    }

    public void aggiungiPortata(Portata p) {
        portate.putIfAbsent(p.getCategoria(), p);
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

    /* public Map<Categoria,Portata> getPortate() {
        return portate;
    } */

    public void setPortate(HashMap<Categoria,Portata> portate) {
        this.portate = portate;
    }
    
    public boolean isValid() {
        int x = 0;
        for (Categoria c : Categoria.values()) {
            if (portate.get(c) != null) x++;
        }
        return x==4;
    }

    public double getPrezzoTotale() {
        double prezzotot = 0;
        for (Categoria c : Categoria.values()) {
            prezzotot += portate.get(c).getPrezzo();
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
            ret += portate.get(c).toString() + "\n";
        }
        return ret;
    }

    public void sostituisciPortata(Portata daMettere) throws Exception {
        if (daMettere == null) {
            throw new NullPointerException();
        } else {
            portate.replace(daMettere.getCategoria(), daMettere);
        }
    }

}
