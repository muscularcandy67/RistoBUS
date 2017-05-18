/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import controller.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import model.*;

/**
 *
 * @author smart
 */
public class OrdinePane extends javax.swing.JPanel {
    
    private Controller mc; 

    /** Creates new form Ordine */
    public OrdinePane(Controller mc) {
        this.mc = mc;
        //System.out.println(mc.getMenus());
        initComponents();
        initStuff();
    }
    
    private void initStuff() {
        menuComboBox.removeAllItems();
        for (Menu m : mc.getMenus()) {
            //System.out.println(m);
            menuComboBox.addItem(m.getNome().substring(0, 1).toUpperCase() + m.getNome().substring(1));
        }
        
        this.populateComboBoxes();
        
    }
    
    private void populateComboBoxes() {
        antipastoComboBox.removeAllItems();
        primoComboBox.removeAllItems();
        secondoComboBox.removeAllItems();
        dessertComboBox.removeAllItems();
        int selected = menuComboBox.getSelectedIndex();
        Menu m = mc.getMenus().get(selected);
        /* antipastoComboBox.setSelectedIndex(0);
        primoComboBox.setSelectedIndex(0);
        secondoComboBox.setSelectedIndex(0);
        dessertComboBox.setSelectedIndex(0); */
        for (Portata p : m.getPortate(Categoria.ANTIPASTO)) {
            antipastoComboBox.addItem(p.getNome());
        }
        for (Portata p : m.getPortate(Categoria.PRIMO)) {
            primoComboBox.addItem(p.getNome());
        }
        for (Portata p : m.getPortate(Categoria.SECONDO)) {
            secondoComboBox.addItem(p.getNome());
        }
        for (Portata p : m.getPortate(Categoria.DESSERT)) {
            dessertComboBox.addItem(p.getNome());
        }
        //
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        antipastoComboBox = new javax.swing.JComboBox<>();
        primoComboBox = new javax.swing.JComboBox<>();
        secondoComboBox = new javax.swing.JComboBox<>();
        dessertComboBox = new javax.swing.JComboBox<>();
        ordinaButton = new javax.swing.JButton();
        prezzoLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clienteTextField = new javax.swing.JTextField();

        menuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Menu");

        jLabel2.setText("Antipasto");

        jLabel3.setText("Primo");

        jLabel4.setText("Secondo");

        jLabel5.setText("Dessert");

        antipastoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antipastoComboBoxActionPerformed(evt);
            }
        });

        primoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primoComboBoxActionPerformed(evt);
            }
        });

        secondoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondoComboBoxActionPerformed(evt);
            }
        });

        dessertComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dessertComboBoxActionPerformed(evt);
            }
        });

        ordinaButton.setText("Ordina");
        ordinaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordinaButtonActionPerformed(evt);
            }
        });

        prezzoLabel.setText("Prezzo");

        jLabel6.setText("Cliente:");

        clienteTextField.setText("Cliente1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(prezzoLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menuComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(antipastoComboBox, 0, 322, Short.MAX_VALUE)
                            .addComponent(dessertComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secondoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(primoComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ordinaButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(antipastoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(primoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(secondoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dessertComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordinaButton)
                    .addComponent(prezzoLabel)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(clienteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComboBoxActionPerformed
        this.populateComboBoxes();
    }//GEN-LAST:event_menuComboBoxActionPerformed

    private void ordinaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordinaButtonActionPerformed
        HashMap<Categoria, Portata> hmcp = new HashMap<>();
        HashMap<Categoria, ArrayList<Portata>> hm = ((MyController) mc).getPortate();
        hmcp.put(Categoria.ANTIPASTO, hm.get(Categoria.ANTIPASTO).get(antipastoComboBox.getSelectedIndex()));
        hmcp.put(Categoria.PRIMO, hm.get(Categoria.PRIMO).get(primoComboBox.getSelectedIndex()));
        hmcp.put(Categoria.SECONDO, hm.get(Categoria.SECONDO).get(secondoComboBox.getSelectedIndex()));
        hmcp.put(Categoria.DESSERT, hm.get(Categoria.DESSERT).get(dessertComboBox.getSelectedIndex()));
        ((MyController) mc).aggiungiOrdine(mc.getMenus().get(menuComboBox.getSelectedIndex()), clienteTextField.getText(), hmcp);
    }//GEN-LAST:event_ordinaButtonActionPerformed

    private void antipastoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antipastoComboBoxActionPerformed
        if (evt.getID() == 1001) {
            printPrice();
        } else {
            System.out.println("BANANA");
        }
        
    }//GEN-LAST:event_antipastoComboBoxActionPerformed

    private void primoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primoComboBoxActionPerformed
        if (evt.getID() == 1001) {
            printPrice();
        }
    }//GEN-LAST:event_primoComboBoxActionPerformed

    private void secondoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondoComboBoxActionPerformed
        if (evt.getID() == 1001) {
            printPrice();
        }
    }//GEN-LAST:event_secondoComboBoxActionPerformed

    private void dessertComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dessertComboBoxActionPerformed
        if (evt.getID() == 1001) {
            printPrice();
        }
    }//GEN-LAST:event_dessertComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> antipastoComboBox;
    private javax.swing.JTextField clienteTextField;
    private javax.swing.JComboBox<String> dessertComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> menuComboBox;
    private javax.swing.JButton ordinaButton;
    private javax.swing.JLabel prezzoLabel;
    private javax.swing.JComboBox<String> primoComboBox;
    private javax.swing.JComboBox<String> secondoComboBox;
    // End of variables declaration//GEN-END:variables

    private void printPrice() {
        
        double prezzo = 0;
        HashMap<Categoria, ArrayList<Portata>> hm = ((MyController) mc).getPortate();
        for (Categoria c : Categoria.values()) {
            //System.out.println(c);
            //System.out.println(hm.get(c));
        }
        
        try {
            prezzo += hm.get(Categoria.ANTIPASTO).get(antipastoComboBox.getSelectedIndex()).getPrezzo();
            prezzo += hm.get(Categoria.PRIMO).get(primoComboBox.getSelectedIndex()).getPrezzo();
            prezzo += hm.get(Categoria.SECONDO).get(secondoComboBox.getSelectedIndex()).getPrezzo();
            prezzo += hm.get(Categoria.DESSERT).get(dessertComboBox.getSelectedIndex()).getPrezzo();
            prezzoLabel.setText("Prezzo: €" + prezzo);
        } catch(Exception e) {
            //e.printStackTrace();
        }
        //firstrun = true;
        
    }

}