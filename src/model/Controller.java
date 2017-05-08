package model;

import java.util.*;

/**
 * 
 */
public interface Controller {

	/**
	 * @param ordine 
	 * @param daMettere
	 */
	public String sostituisciPortata(Ordine ordine, Portata daMettere);

	/**
	 * 
	 */
	public ArrayList<Menu> getMenus();

	/**
	 * @param m 
	 * @param nomeCliente
	 */
	public Ordine creaOrdine(Menu m, String nomeCliente);

	/**
	 * @param p
	 */
	public boolean aggiungiPortata(Portata p);

	/**
	 * @param m
	 */
	public boolean aggiungiMenu(Menu m);

}