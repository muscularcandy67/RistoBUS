package controller;

import java.util.*;
import model.Menu;
import model.MenuManager;
import model.MyPortateManager;
import model.Ordine;
import model.Portata;
import model.UserInteractor;

/**
 * 
 */
public class MyController implements Controller {

	/**
	 * Default constructor
	 */
    public MyController() {
    
    }

    public void MyController(MyPortateManager p, MenuManager m, UserInteractor u) {
    	// TODO implement here
    }

    public ArrayList<Menu> getMenus() {
	// TODO implement here
	return null;
    }

    @Override
    public String sostituisciPortata(Ordine ordine, Portata daMettere) {
        return "";
    }

    @Override
    public Ordine creaOrdine(Menu m, String nomeCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean aggiungiPortata(Portata p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean aggiungiMenu(Menu m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        

}