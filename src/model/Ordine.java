/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Iskandar Montano
 */
public class Ordine {
    private String nome_Cliente;
    private Menu menu;
    private Map<String,Portata> portate;

    public Ordine(String nome_Cliente, Menu menu) {
        this.nome_Cliente = nome_Cliente;
        this.menu = menu;
    }
    
    public Map getElencoPortate(){
        return portate;
    }
    
    public boolean aggiungiPortata(Portata p){
        portate.put(p.getCategoria(),p);
        return true;
    }

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public void setNome_Cliente(String nome_Cliente) {
        this.nome_Cliente = nome_Cliente;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Map<String, Portata> getPortate() {
        return portate;
    }

    public void setPortate(Map<String, Portata> portate) {
        this.portate = portate;
    }
    
    
}
