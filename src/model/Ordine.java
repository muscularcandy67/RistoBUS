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

    private String nome_Cliente;
    private Map<Categoria, Portata> portate;
    private Menu menu;

    public Ordine(String nome_Cliente, Menu menu) {
        setNome_Cliente(nome_Cliente);
        setMenu(menu);
    }

    public Map<Categoria, Portata> getElencoPortate() {
        return portate;
    }

    public void aggiungiPortata(Categoria c, Portata p) {
        portate.putIfAbsent(c, p);
    }

    public String getNome_Cliente() {
        return nome_Cliente;
    }

    public boolean setNome_Cliente(String nome_Cliente) {
        if (nome_Cliente != null && !nome_Cliente.isEmpty()) {
            this.nome_Cliente = nome_Cliente;
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

    public Map<Categoria,Portata> getPortate() {
        return portate;
    }

    public void setPortate(Map<Categoria,Portata> portate) {
        
    }

}
