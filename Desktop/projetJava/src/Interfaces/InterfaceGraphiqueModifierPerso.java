/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author clementraphaell
 */
public class InterfaceGraphiqueModifierPerso extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceGraphiqueModifierPerso
     */
    public InterfaceGraphiqueModifierPerso() {
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

        labelModifPers = new javax.swing.JLabel();
        labelNomModifPers = new javax.swing.JLabel();
        labelPrenModifPers = new javax.swing.JLabel();
        labelCompModifPers = new javax.swing.JLabel();
        textFieldNomModifPers = new javax.swing.JTextField();
        textFieldPrenModifPers = new javax.swing.JTextField();
        comboBoxCompModifPers = new javax.swing.JComboBox<>();
        buttonAjouterModifPers = new javax.swing.JButton();
        buttonSupprimerModifPers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelModifPers = new javax.swing.JTable();
        buttonModifModifPers = new javax.swing.JButton();
        buttoneSuppModifPers = new javax.swing.JButton();
        buttonRetourModifPers = new javax.swing.JButton();
        buttonSauvModifPers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelModifPers.setText("Modifier Personnel");

        labelNomModifPers.setText("Nom :");

        labelPrenModifPers.setText("Prénom :");

        labelCompModifPers.setText("Compétences :");

        textFieldNomModifPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomModifPersActionPerformed(evt);
            }
        });

        comboBoxCompModifPers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonAjouterModifPers.setText("Ajouter");

        buttonSupprimerModifPers.setText("Supprimer");
        buttonSupprimerModifPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupprimerModifPersActionPerformed(evt);
            }
        });

        tabelModifPers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Prénom", "Nom", "Identifiant", "Compétences"
            }
        ));
        jScrollPane1.setViewportView(tabelModifPers);

        buttonModifModifPers.setText("Modifier");

        buttoneSuppModifPers.setText("Supprimer");

        buttonRetourModifPers.setText("Retour");
        buttonRetourModifPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRetourModifPersMouseClicked(evt);
            }
        });
        buttonRetourModifPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetourModifPersActionPerformed(evt);
            }
        });

        buttonSauvModifPers.setText("Sauvegarder");
        buttonSauvModifPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSauvModifPersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPrenModifPers)
                        .addGap(37, 37, 37)
                        .addComponent(textFieldPrenModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNomModifPers)
                        .addGap(54, 54, 54)
                        .addComponent(textFieldNomModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCompModifPers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxCompModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonSupprimerModifPers)
                            .addComponent(buttonAjouterModifPers))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(labelModifPers)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonSauvModifPers)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonModifModifPers)
                        .addGap(31, 31, 31)
                        .addComponent(buttoneSuppModifPers)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRetourModifPers)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelModifPers)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomModifPers)
                    .addComponent(textFieldNomModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrenModifPers)
                    .addComponent(textFieldPrenModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCompModifPers)
                    .addComponent(comboBoxCompModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAjouterModifPers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSupprimerModifPers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModifModifPers)
                    .addComponent(buttoneSuppModifPers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetourModifPers)
                    .addComponent(buttonSauvModifPers)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomModifPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomModifPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomModifPersActionPerformed

    private void buttonSupprimerModifPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupprimerModifPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSupprimerModifPersActionPerformed

    private void buttonRetourModifPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetourModifPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRetourModifPersActionPerformed

    private void buttonSauvModifPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSauvModifPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSauvModifPersActionPerformed

    private void buttonRetourModifPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRetourModifPersMouseClicked
        // TODO add your handling code here:
        InterfaceGraphiquePersonnel Personnel = new InterfaceGraphiquePersonnel();
        this.dispose();
        Personnel.setVisible(true);
    }//GEN-LAST:event_buttonRetourModifPersMouseClicked

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
            java.util.logging.Logger.getLogger(InterfaceGraphiqueModifierPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphiqueModifierPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphiqueModifierPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphiqueModifierPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGraphiqueModifierPerso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjouterModifPers;
    private javax.swing.JButton buttonModifModifPers;
    private javax.swing.JButton buttonRetourModifPers;
    private javax.swing.JButton buttonSauvModifPers;
    private javax.swing.JButton buttonSupprimerModifPers;
    private javax.swing.JButton buttoneSuppModifPers;
    private javax.swing.JComboBox<String> comboBoxCompModifPers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCompModifPers;
    private javax.swing.JLabel labelModifPers;
    private javax.swing.JLabel labelNomModifPers;
    private javax.swing.JLabel labelPrenModifPers;
    private javax.swing.JTable tabelModifPers;
    private javax.swing.JTextField textFieldNomModifPers;
    private javax.swing.JTextField textFieldPrenModifPers;
    // End of variables declaration//GEN-END:variables
}
