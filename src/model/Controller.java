package model;

import java.util.*;


public interface Controller {


	public String sostituisciPortata(Ordine ordine, Portata daMettere);

	public ArrayList<Menu> getMenus();

	public Ordine creaOrdine(Menu m, String nomeCliente);

	public boolean aggiungiPortata(Portata p);

	public boolean aggiungiMenu(Menu m);

}