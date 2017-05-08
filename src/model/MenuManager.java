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
	public ArrayList<Menu> caricaPortate(Map m);

	/**
	 * @param Menu m 
	 * @return
	 */
	public void salvaPortate(Menu m);

}