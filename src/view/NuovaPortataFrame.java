/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.alee.laf.WebLookAndFeel;
import controller.*;
import model.Categoria;
import model.Portata;

/**
 *
 * @author smart
 */
public class NuovaPortataFrame extends javax.swing.JFrame {
    
    Controller mc;
    RistoGUI rgui;

    /**
     * Creates new form NuovaPortataFrame
     * @param mc that thing
     */
    public NuovaPortataFrame(Controller mc, RistoGUI rgui) {
        this.mc = mc;
        this.rgui = rgui;
        initComponents();
        initComboBox();
        rgui.updateOrdineUI();
        rgui.updateOrdineUI();
    }
    
    private void initComboBox() {
        categoriaComboBox.removeAllItems();
        for (Categoria c : Categoria.values()) {
            categoriaComboBox.addItem(c.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        prezzoTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        creaPortataButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        categoriaComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel5.setText("Prezzo");

        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        idTextField.setToolTipText("");

        creaPortataButton.setText("Crea portata");
        creaPortataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaPortataButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nuova Portata");

        jLabel2.setText("Nome");

        jLabel3.setText("ID");

        jLabel4.setText("Categoria");

        categoriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTextField)
                            .addComponent(prezzoTextField)
                            .addComponent(idTextField)
                            .addComponent(categoriaComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 287, Short.MAX_VALUE)
                        .addComponent(creaPortataButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(categoriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(prezzoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(creaPortataButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void creaPortataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaPortataButtonActionPerformed
        String validitycheck = areValuesValid();
        if (validitycheck.isEmpty()) {
            System.out.println(categoriaComboBox.getSelectedIndex());
            int sel = categoriaComboBox.getSelectedIndex();
            if (sel < 0 || sel >= Categoria.values().length) {
                sel = 0;
            }
            Categoria cat = Categoria.values()[sel];
            String nome = nomeTextField.getText();
            String id = idTextField.getText();
            double prezzo = Double.parseDouble(prezzoTextField.getText());
            Portata p = new Portata(cat, id, nome, prezzo);
            System.out.println("NuovaPortataFrame/LOG :" + p);
            mc.aggiungiPortata(p);
            rgui.updateOrdineUI();
            setVisible(false); //you can't see me!
            dispose();
        } else {
            ((MyController) mc).getUserInteractor().showMessage("Errore! I campi sono stati compilati in modo scorretto:" + validitycheck);
        }
    }//GEN-LAST:event_creaPortataButtonActionPerformed

    private String areValuesValid() {
        String msg = "";
        double prezzo = 0;
        
        if (nomeTextField.getText().isEmpty()) {
            msg += "\nManca il nome della portata";
        }
        
        if (idTextField.getText().isEmpty()) {
            msg += "\nManca l'ID della portata";
        }
        
        try {
            prezzo = Double.parseDouble(prezzoTextField.getText());
        } catch(NumberFormatException e) {
            msg += "\nInserisci un prezzo valido!";
        }
        
        if (prezzo < 0) {
            msg += "\nIl prezzo non è maggiore di 0!";
        }
        
        return msg;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(Controller m, RistoGUI rgui) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RistoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuovaPortataFrame(m, rgui).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> categoriaComboBox;
    private javax.swing.JButton creaPortataButton;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField prezzoTextField;
    // End of variables declaration//GEN-END:variables
}
