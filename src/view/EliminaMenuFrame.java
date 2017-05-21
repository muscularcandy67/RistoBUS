/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.alee.laf.WebLookAndFeel;
import controller.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author smart
 */
public class EliminaMenuFrame extends javax.swing.JFrame {

    Controller mc;
    
    public EliminaMenuFrame(Controller mc) {
        this.mc = mc;
        initComponents();
        initList();
    }
    
    private void initList() {
        DefaultListModel dlm = new DefaultListModel();
        ((MyController) mc).getMenus().forEach((m) -> {
            dlm.addElement(m.getNome());
        });
        menuList.setModel(dlm);
        menuList.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eliminaMenuButton = new javax.swing.JButton();
        eliminaTuttoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        eliminaMenuButton.setText("Elimina menu selezionato");
        eliminaMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaMenuButtonActionPerformed(evt);
            }
        });

        eliminaTuttoButton.setText("Elimina tutto");
        eliminaTuttoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaTuttoButtonActionPerformed(evt);
            }
        });

        menuList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        menuList.setSelectedIndex(0);
        jScrollPane1.setViewportView(menuList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminaMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminaTuttoButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminaMenuButton)
                    .addComponent(eliminaTuttoButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminaMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaMenuButtonActionPerformed
        System.out.println(menuList);                                                    //        <-- questo cancro non printa niente
        ((MyController) mc).eliminaMenu(menuList.getSelectedIndex());
        initList();
    }//GEN-LAST:event_eliminaMenuButtonActionPerformed

    private void eliminaTuttoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaTuttoButtonActionPerformed
        ((MyController) mc).eliminaTuttiOrdini();
        initList();
    }//GEN-LAST:event_eliminaTuttoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(Controller mc) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new WebLookAndFeel());
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminaMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminaMenuFrame(mc).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminaMenuButton;
    private javax.swing.JButton eliminaTuttoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> menuList;
    // End of variables declaration//GEN-END:variables
}