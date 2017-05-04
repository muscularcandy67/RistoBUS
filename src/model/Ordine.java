package model;

import java.util.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Iskandar Montano
 */
public class Ordine {
        
	private String nome_Cliente;
	private Map<Categoria,Portata> portate;
	private Menu menu;

    public Ordine(String nome_Cliente, Map<Categoria, Portata> portate, Menu menu) {
        setNome_Cliente(nome_Cliente);
        setPortate(portate);
        setMenu(menu);
    }
    
    public Map<Categoria,Portata> getElencoPortate() {
		return portate;
    }

    public void aggiungiPortata(Categoria c, Portata p) {
            portate.putIfAbsent(c,p);
    }

	/**
	 * @return
	 */
	public String getNome_Cliente() {
		// TODO implement here
		return "";
	}

	/**
	 * @param nome_Cliente 
	 * @return
	 */
	public void setNome_Cliente(String nome_Cliente) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Menu getMenu() {
		// TODO implement here
		return null;
	}

	/**
	 * @param menu 
	 * @return
	 */
	public void setMenu(Menu menu) {
		// TODO implement here
	}

	/**
	 * @return
	 */
	public Map getPortate() {
		// TODO implement here
		return null;
	}

	/**
	 * @param portate 
	 * @return
	 */
	public void setPortate(Map portate) {
		// TODO implement here
	}

}