/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Iskandar Montano
 */
public interface PortateManager {
    public HashMap<Categoria,ArrayList<Portata>> caricaPortate();
    public void salvaPortata(Portata p);
}
