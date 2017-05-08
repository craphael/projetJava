/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Competence.Competence;
import Entreprise.Entreprise;
import Personnel.Personnel;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clementraphaell
 */
public class InterfaceGraphiqueModifierPerso extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceGraphiqueModifierPerso
     * @throws java.io.IOException
     */
    public InterfaceGraphiqueModifierPerso() throws IOException {
        initComponents();
        Entreprise e = new Entreprise();
        this.initTabPersonnel();
        this.remplissage();
        
    }
    
    
    private void initTabPersonnel() {
        DefaultTableModel model = (DefaultTableModel) tabelModifPers.getModel();
        Iterator i = Entreprise.tPersonnels.keySet().iterator();
        Integer clef = null;
        Personnel valeur = null;
        while (i.hasNext())
        {
            clef = (Integer)i.next();
            valeur = Entreprise.tPersonnels.get(clef);
            model.addRow(new Object[]{valeur.getId(), valeur.getNom(), valeur.getPrenom()});
        }
        model.removeRow(0);
        model.removeRow(0);
        model.removeRow(0);
        model.removeRow(0);
    }
    
    private void remplissage() throws IOException{
        Entreprise e = new Entreprise();
        Set<String> keys = Entreprise.tCompetences.keySet();
        for(String key: keys){
            Competence p = Entreprise.tCompetences.get(key);
            this.comboBoxCompModifPers.addItem(p.toString());
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

        jPanel1 = new javax.swing.JPanel();
        labelNomModifPers = new javax.swing.JLabel();
        buttoneSuppModifPers = new javax.swing.JButton();
        labelPrenModifPers = new javax.swing.JLabel();
        buttonRetourModifPers = new javax.swing.JButton();
        buttonSauvModifPers = new javax.swing.JButton();
        labelCompModifPers = new javax.swing.JLabel();
        textFieldNomModifPers = new javax.swing.JTextField();
        textFieldPrenModifPers = new javax.swing.JTextField();
        comboBoxCompModifPers = new javax.swing.JComboBox<>();
        buttonAjouterModifPers = new javax.swing.JButton();
        buttonSupprimerModifPers = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelModifPers = new javax.swing.JTable();
        labelModifPers = new javax.swing.JLabel();
        buttonModifModifPers = new javax.swing.JButton();
        LabelModifPersVerif = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 225, 213));

        labelNomModifPers.setText("Nom :");

        buttoneSuppModifPers.setText("Supprimer");

        labelPrenModifPers.setText("Prénom :");

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
        buttonSauvModifPers.setEnabled(false);
        buttonSauvModifPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSauvModifPersActionPerformed(evt);
            }
        });

        labelCompModifPers.setText("Compétences :");

        textFieldNomModifPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomModifPersActionPerformed(evt);
            }
        });

        comboBoxCompModifPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxCompModifPersMouseClicked(evt);
            }
        });

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

        labelModifPers.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelModifPers.setText("Modifier Personnel");

        buttonModifModifPers.setText("Modifier");
        buttonModifModifPers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonModifModifPersMouseClicked(evt);
            }
        });
        buttonModifModifPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModifModifPersActionPerformed(evt);
            }
        });

        LabelModifPersVerif.setText("Verification :");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomModifPers)
                                    .addComponent(labelPrenModifPers))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldPrenModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNomModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelModifPers)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelCompModifPers)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxCompModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonSupprimerModifPers)
                                    .addComponent(buttonAjouterModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelModifPersVerif)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(buttonSauvModifPers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRetourModifPers))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(buttonModifModifPers)
                        .addGap(126, 126, 126)
                        .addComponent(buttoneSuppModifPers)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelModifPers)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomModifPers)
                    .addComponent(textFieldNomModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPrenModifPers)
                    .addComponent(textFieldPrenModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCompModifPers)
                    .addComponent(comboBoxCompModifPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAjouterModifPers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSupprimerModifPers)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonModifModifPers)
                    .addComponent(buttoneSuppModifPers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelModifPersVerif)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRetourModifPers)
                    .addComponent(buttonSauvModifPers)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        InterfaceGraphiquePersonnel Personnel = null;
        try {
            Personnel = new InterfaceGraphiquePersonnel();
        } catch (IOException ex) {
            Logger.getLogger(InterfaceGraphiqueModifierPerso.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        Personnel.setVisible(true);
    }//GEN-LAST:event_buttonRetourModifPersMouseClicked

    private void comboBoxCompModifPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxCompModifPersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCompModifPersMouseClicked

    private void buttonModifModifPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModifModifPersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonModifModifPersActionPerformed

    private void buttonModifModifPersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonModifModifPersMouseClicked
        // TODO add your handling code here:
        boolean remplie = this.Verifier();
        String lignes = new String();
        if(remplie == true){
            //tableAjouterPers.add(lignes);
            jTextArea1.setText("Bien remplie");
        }
        else
            jTextArea1.setText("Vous n'avez pas tous remplie");
    }//GEN-LAST:event_buttonModifModifPersMouseClicked

    
    public boolean Verifier() 
        {
            boolean verifier = true;
            if((textFieldNomModifPers.getText().equals(""))||(textFieldPrenModifPers.getText().equals(""))){
                verifier = false;        
            }
            return verifier;
        }
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
                try {
                    new InterfaceGraphiqueModifierPerso().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(InterfaceGraphiqueModifierPerso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelModifPersVerif;
    private javax.swing.JButton buttonAjouterModifPers;
    private javax.swing.JButton buttonModifModifPers;
    private javax.swing.JButton buttonRetourModifPers;
    private javax.swing.JButton buttonSauvModifPers;
    private javax.swing.JButton buttonSupprimerModifPers;
    private javax.swing.JButton buttoneSuppModifPers;
    private javax.swing.JComboBox<String> comboBoxCompModifPers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelCompModifPers;
    private javax.swing.JLabel labelModifPers;
    private javax.swing.JLabel labelNomModifPers;
    private javax.swing.JLabel labelPrenModifPers;
    private javax.swing.JTable tabelModifPers;
    private javax.swing.JTextField textFieldNomModifPers;
    private javax.swing.JTextField textFieldPrenModifPers;
    // End of variables declaration//GEN-END:variables
}
