package model;

import java.util.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Iskandar Montano
 */
public class Menu {

	
	private String menu;        
	private Map<Categoria,ArrayList<Portata>> portate;
        
	public Menu(String menu, Map<Categoria,Portata> portate) {
		
	}
	public String getNome() {
		return this.menu;
	}
        
	public boolean setNome(String menu) {
            if(menu!=null && !menu.isEmpty()){
                this.menu=menu;
                return true;
            }
            else return false;
        }

        public Map<Categoria,ArrayList<Portata>> getMenu() {
		
		return portate;
	}

	public ArrayList<Portata> getPortata(Categoria categoria) {
            return portate.get(categoria);
	}

	public boolean setPortate(Map<Categoria,ArrayList<Portata>> portate) {
		if(portate!=null){
                    this.portate=portate;
                    return true;
                }
                else return false;
	}

	public void toFileFormat() {
            StringBuilder s= new StringBuilder();
		s.append("MENU").append(menu).append("\n").append("ANTIPASTO: ").append(portate.get(Categoria.ANTIPASTO));
	       for(int i =1;i<=portate.keySet().size();i++)
                   Categoria.values();
                   
        }

}