package model;

import java.util.*;

/**
 * 
 */
public interface MenuManager {

	/**
	 * @param Map m 
	 * @return
	 */
	public ArrayList<Menu> caricaMenu(HashMap<Categoria, ArrayList<Portata>> mm);

	/**
	 * @param Menu m 
	 * @return
	 */
	public void salvaMenu(Menu m);

}