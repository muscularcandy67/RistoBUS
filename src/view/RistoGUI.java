/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import com.alee.laf.WebLookAndFeel;
import controller.*;
import model.*;

/**
 *
 * @author smart
 */
public class RistoGUI extends javax.swing.JFrame {

    /**
     * Creates new form RistoGUI
     */
    
    private view.OrdinePane ordinetab;
    
    MyController mc;
    
    public RistoGUI() {
        mc = new MyController(new MyPortateManager(), new MyMenuManager(), new SwingUserInteractor()); //pm, mm, ui
        initComponents();
        initPanes();
    }
    
    private void initPanes() {
        this.setTitle("RistoBUS");
        //System.out.println(mc.toString());
        ordinetab = new view.OrdinePane(mc);
        setContentPane(ordinetab);
    }
    
    public void updateOrdineUI() {
        try {
            ordinetab.initStuff();
        } catch (Exception e) {
            
        }
        System.out.println("WEWEWEWE");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        portataMenuItem = new javax.swing.JMenuItem();
        menuMenuItem = new javax.swing.JMenuItem();
        ordineMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jMenu1.setText("Nuovo");

        portataMenuItem.setText("Nuova Portata");
        portataMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portataMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(portataMenuItem);

        menuMenuItem.setText("Nuovo Menu");
        menuMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(menuMenuItem);

        jMenuBar1.add(jMenu1);

        ordineMenu.setText("Ordine");
        jMenuBar1.add(ordineMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 233, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void portataMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portataMenuItemActionPerformed
        NuovaPortataFrame.main(mc, this);
    }//GEN-LAST:event_portataMenuItemActionPerformed

    private void menuMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMenuItemActionPerformed
        NuovoMenuFrame.main(mc, this);
    }//GEN-LAST:event_menuMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
                new RistoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuMenuItem;
    private javax.swing.JMenu ordineMenu;
    private javax.swing.JMenuItem portataMenuItem;
    // End of variables declaration//GEN-END:variables
}
