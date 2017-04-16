/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author Iskandar Montano
 */
public class Menu {
    private String menu;
    private Map portate;

    public Menu(String menu, Map portate) {
        this.menu = menu;
        this.portate = portate;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public Map getPortate() {
        return portate;
    }
    
    public Map getPortate(String categoria){
        return portate;
    }

    public void setPortate(Map portate) {
        this.portate = portate;
    }
    
    
}
