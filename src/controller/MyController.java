package controller;

import java.util.*;
import model.*;

/**
 * 
 */
public class MyController implements Controller {

    private PortateManager pm;
    private MenuManager mm;
    private UserInteractor ui;
    
    private ArrayList<Menu> menus;
    private HashMap<Categoria, ArrayList<Portata>> portate;
    private ArrayList<Ordine> ordini;

    public MyController(MyPortateManager p, MenuManager m, UserInteractor u) {
    	this.pm = p;
        this.mm = m;
        this.ui = u;
        menus = this.getMenus();
        portate = pm.caricaPortate();
        ordini = new ArrayList<>();
    }

    public ArrayList<Menu> getMenus() {
	return mm.caricaMenu(pm.caricaPortate());
    }

    @Override
    public String sostituisciPortata(Ordine ordine, Portata daMettere) {
        try {
            ordine.sostituisciPortata(daMettere);
            return null;
        } catch(Exception e) {
            return e.toString();
        }
    }

    @Override
    public Ordine creaOrdine(Menu m, String nomeCliente) {
        return new Ordine(nomeCliente, m);
    }
    
    public void aggiungiOrdine(Menu m, String nomeCliente, HashMap<Categoria, Portata> hmcp) {
        Ordine o = creaOrdine(m, nomeCliente);
        for (Categoria c : Categoria.values()) {
            try {
                o.aggiungiPortata(hmcp.get(c));
            } catch(Exception e) {
                ui.showMessage("PROBLEMA! \n");
                e.printStackTrace();
            }
        }
        ordini.add(o);
        ui.showMessage(ordini.toString());
    } 

    @Override
    public boolean aggiungiPortata(Portata p) {
        if (p != null) {
            pm.salvaPortata(p);
            return true;
        }
        return false;
    }

    @Override
    public boolean aggiungiMenu(Menu m) {
        if (m != null) {
            mm.salvaMenu(m);
            return true;
        }
        return false;
    }

    public HashMap<Categoria, ArrayList<Portata>> getPortate() {
        return portate;
    }
        
        

}