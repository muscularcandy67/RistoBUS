package controller;

import java.util.*;
import model.Menu;
import model.Ordine;
import model.Portata;


public interface Controller {


	public String sostituisciPortata(Ordine ordine, Portata daMettere);

	public ArrayList<Menu> getMenus();

	public Ordine creaOrdine(Menu m, String nomeCliente);

	public boolean aggiungiPortata(Portata p);

	public boolean aggiungiMenu(Menu m);

}