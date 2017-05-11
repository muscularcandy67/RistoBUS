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
	private HashMap<Categoria,ArrayList<Portata>> portate;
        
	public Menu(String menu, HashMap<Categoria,ArrayList<Portata>> portate) {
            this.setNome(menu);
            this.setPortate(portate);
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
        
        public HashMap<Categoria,ArrayList<Portata>> getPortate() {
            return portate;
        }

	public ArrayList<Portata> getPortate(Categoria categoria) {
            return portate.get(categoria);
	}

	public boolean setPortate(HashMap<Categoria,ArrayList<Portata>> portate) {
		if(portate!=null){
                    this.portate=portate;
                    return true;
                }
                else return false;
	}

	public String toFileFormat() {
            String s= "";
            s += "MENU" + menu + "\n";
            
            for (Categoria c : Categoria.values()) {
                s += c.toString() + ": ";
                for(int i=0; i<portate.get(c).size(); i++) {
                    s += portate.get(c).get(i).getID();
                    if (i+1 != portate.get(c).size()) {
                        s += ", ";
                    }
                }
                s += "\n";
            }
            
            s += "END MENU";
            return s;
                   
        }

}