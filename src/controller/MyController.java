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
        if (menus == null || portate == null) {
            u.showMessage("Errore nel caricamento delle portate e dei menu");
            u.shutDownApplication();
        }
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
    
    public UserInteractor getUserInteractor() {
        return ui;
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
        //ui.showMessage(ordini.toString());
    } 

    @Override
    public boolean aggiungiPortata(Portata p) {
        if (p != null) {
            pm.salvaPortata(p);
            portate = pm.caricaPortate();
            return true;
        }
        return false;
    }

    @Override
    public boolean aggiungiMenu(Menu m) {
        if (m != null) {
            mm.salvaMenu(m);
            menus = this.getMenus();
            return true;
        }
        return false;
    }

    public HashMap<Categoria, ArrayList<Portata>> getPortate() {
        return portate;
    }
    
    public void eliminaOrdine(int pos) {
        this.ordini.remove(pos);
    }
    
    public ArrayList<Ordine> getOrdini() {
        return ordini;
    }
    
    public void eliminaTuttiOrdini() {
        this.ordini.clear();
    }
        
    public boolean eliminaMenu(int pos) {
        if (menus.size() > pos && pos>=0) {
            ((MyMenuManager) mm).eliminaMenu(menus.get(pos));
            menus = this.getMenus();
            return true;
        }
        return false;
    }  
    
    public boolean eliminaPortata(Portata p) {
        if (p != null && (esistePortata(p))) {
            //((MyMenuManager) mm).elimina(p);
            return true;
        }
        return false;
    }
    
    public boolean esistePortata(Portata p) {
        for (Categoria c : Categoria.values()) {
            if (portate.get(c).stream().anyMatch((po) -> (p.equals(po)))) {
                return true;
            }
        }
        return false;
    }

}