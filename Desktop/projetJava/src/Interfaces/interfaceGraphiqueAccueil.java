/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author clementraphaell
 */
public class interfaceGraphiqueAccueil extends javax.swing.JFrame {
    /**
     * Creates new form interfaceGraphiqueAccueil
     */
    
    
    public interfaceGraphiqueAccueil() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAccueil = new javax.swing.JLabel();
        buttonGestionPers = new javax.swing.JButton();
        buttonGestionMiss = new javax.swing.JButton();
        buttonGestionComp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAccueil.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelAccueil.setText("Accueil");
        labelAccueil.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelAccueil.setAlignmentX(1.0F);
        labelAccueil.setAlignmentY(1.0F);
        labelAccueil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelAccueil.setMaximumSize(new java.awt.Dimension(70, 18));
        labelAccueil.setPreferredSize(new java.awt.Dimension(60, 60));
        labelAccueil.setSize(new java.awt.Dimension(60, 60));

        buttonGestionPers.setText("Gestion du personnel");
        buttonGestionPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGestionPersMouseClicked(evt);
            }
        });
        buttonGestionPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGestionPersActionPerformed(evt);
            }
        });

        buttonGestionMiss.setText("Gestion des missions");
        buttonGestionMiss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGestionMissMouseClicked(evt);
            }
        });

        buttonGestionComp.setText("Gestion des compétences");
        buttonGestionComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonGestionCompMouseClicked(evt);
            }
        });
        buttonGestionComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGestionCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(labelAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonGestionPers, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGestionMiss)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonGestionComp, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGestionPers, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonGestionMiss, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonGestionComp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGestionPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGestionPersActionPerformed
        // TODO add your handling code here 
    }//GEN-LAST:event_buttonGestionPersActionPerformed

    private void buttonGestionCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGestionCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonGestionCompActionPerformed

    private void buttonGestionPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGestionPersMouseClicked
        // TODO add your handling code here:
        InterfaceGraphiquePersonnel Personnel = new InterfaceGraphiquePersonnel();
        this.dispose();
        Personnel.setVisible(true);
    }//GEN-LAST:event_buttonGestionPersMouseClicked

    private void buttonGestionMissMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGestionMissMouseClicked
        // TODO add your handling code here:
        InterfaceGraphiqueMissions Missions = new InterfaceGraphiqueMissions();
        this.dispose();
        Missions.setVisible(true);
    }//GEN-LAST:event_buttonGestionMissMouseClicked

    private void buttonGestionCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGestionCompMouseClicked
        // TODO add your handling code here:
        InterfaceGraphiqueCompetences Competences = new InterfaceGraphiqueCompetences();
        this.dispose();
        Competences.setVisible(true);
    }//GEN-LAST:event_buttonGestionCompMouseClicked

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphiqueAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphiqueAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphiqueAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphiqueAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceGraphiqueAccueil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGestionComp;
    private javax.swing.JButton buttonGestionMiss;
    private javax.swing.JButton buttonGestionPers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAccueil;
    // End of variables declaration//GEN-END:variables

    
}
