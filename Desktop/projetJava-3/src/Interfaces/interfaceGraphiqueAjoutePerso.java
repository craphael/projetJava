/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Competence.Competence;
import Personnel.Personnel;
import Interfaces.InterfaceGraphiquePersonnel;
import java.awt.PopupMenu;
import Entreprise.Entreprise;
import Mission.Mission;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.O;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author clementraphaell
 */
public class interfaceGraphiqueAjoutePerso extends javax.swing.JFrame {

    
    /**
     * Creates new form interfaceGraphiqueAjoutePerso
     * @throws java.io.IOException
     */
    public interfaceGraphiqueAjoutePerso() throws IOException {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents(); 
        Entreprise e = new Entreprise();
        this.initTabPersonnel();
        this.remplissage();
    }

     private void initTabPersonnel() {
        DefaultTableModel model = (DefaultTableModel) tableAjouterPers.getModel();
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
            this.comboBoxCompAjoutePers1.addItem(p.toString());
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
        buttonAjouterAjoutePers = new javax.swing.JButton();
        labelDateEntAjoutePers = new javax.swing.JLabel();
        buttonRetourAjoutePers = new javax.swing.JButton();
        textFieldPreAjoutePers = new javax.swing.JTextField();
        buttonSauvAjoutePers = new javax.swing.JButton();
        textFieldNomAjoutePers = new javax.swing.JTextField();
        textFieldDateEntreAjoutePers = new javax.swing.JTextField();
        labelCompAjoutePers = new javax.swing.JLabel();
        comboBoxCompAjoutePers1 = new javax.swing.JComboBox<>();
        labelAjoutePers = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAjouterPers = new javax.swing.JTable();
        labelPrenAjoutePers = new javax.swing.JLabel();
        labelNomAjoutePers = new javax.swing.JLabel();
        ButtonAjouterPersoAjouterComp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextAreaAjouterPers = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 225, 213));

        buttonAjouterAjoutePers.setText("Ajouter");
        buttonAjouterAjoutePers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAjouterAjoutePersMouseClicked(evt);
            }
        });
        buttonAjouterAjoutePers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAjouterAjoutePersActionPerformed(evt);
            }
        });

        labelDateEntAjoutePers.setText("Date d'entrée :");

        buttonRetourAjoutePers.setText("Retour");
        buttonRetourAjoutePers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRetourAjoutePersMouseClicked(evt);
            }
        });

        textFieldPreAjoutePers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPreAjoutePersActionPerformed(evt);
            }
        });

        buttonSauvAjoutePers.setText("Sauvegarder");
        buttonSauvAjoutePers.setEnabled(false);

        labelCompAjoutePers.setText("Compétences :");

        labelAjoutePers.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        labelAjoutePers.setText("Ajouter Personnel");

        tableAjouterPers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nom", "Prenom"
            }
        ));
        jScrollPane1.setViewportView(tableAjouterPers);

        labelPrenAjoutePers.setText("Prénom :");

        labelNomAjoutePers.setText("Nom :");

        ButtonAjouterPersoAjouterComp.setText("Ajouter");

        jLabel1.setText("Verification:");

        TextAreaAjouterPers.setColumns(20);
        TextAreaAjouterPers.setRows(5);
        jScrollPane2.setViewportView(TextAreaAjouterPers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(labelAjoutePers)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(buttonSauvAjoutePers)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonRetourAjoutePers)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(123, 123, 123)
                                    .addComponent(ButtonAjouterPersoAjouterComp))
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelCompAjoutePers)))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboBoxCompAjoutePers1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelDateEntAjoutePers)
                                    .addGap(34, 34, 34)
                                    .addComponent(textFieldDateEntreAjoutePers, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelNomAjoutePers)
                                    .addComponent(labelPrenAjoutePers))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldPreAjoutePers, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textFieldNomAjoutePers, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(buttonAjouterAjoutePers)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelAjoutePers)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSauvAjoutePers)
                            .addComponent(buttonRetourAjoutePers))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPrenAjoutePers, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPreAjoutePers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomAjoutePers)
                            .addComponent(textFieldNomAjoutePers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDateEntAjoutePers)
                            .addComponent(textFieldDateEntreAjoutePers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCompAjoutePers)
                            .addComponent(comboBoxCompAjoutePers1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAjouterPersoAjouterComp)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(buttonAjouterAjoutePers)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRetourAjoutePersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRetourAjoutePersMouseClicked
        // TODO add your handling code here:
        InterfaceGraphiquePersonnel Personnel = null;
        try {
            Personnel = new InterfaceGraphiquePersonnel();
        } catch (IOException ex) {
            Logger.getLogger(InterfaceGraphiqueModifierPerso.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        Personnel.setVisible(true);
    }//GEN-LAST:event_buttonRetourAjoutePersMouseClicked

    private void buttonAjouterAjoutePersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjouterAjoutePersMouseClicked
        // TODO add your handling code here:
        boolean remplie = this.Verifier();
        String lignes = new String();
        if(remplie == true){
            //tableAjouterPers.add(lignes);
            TextAreaAjouterPers.setText("Bien remplie");
        }
        else
            TextAreaAjouterPers.setText("Vous n'avez pas tous remplie");
    }//GEN-LAST:event_buttonAjouterAjoutePersMouseClicked

    private void buttonAjouterAjoutePersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAjouterAjoutePersActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonAjouterAjoutePersActionPerformed

    private void textFieldPreAjoutePersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPreAjoutePersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPreAjoutePersActionPerformed

    public boolean Verifier() 
    {
        boolean verifier = true;
        if((textFieldPreAjoutePers.getText().equals(""))||(textFieldNomAjoutePers.getText().equals(""))||(textFieldDateEntreAjoutePers.getText().equals(""))){
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
            java.util.logging.Logger.getLogger(interfaceGraphiqueAjoutePerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphiqueAjoutePerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphiqueAjoutePerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceGraphiqueAjoutePerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new interfaceGraphiqueAjoutePerso().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(interfaceGraphiqueAjoutePerso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAjouterPersoAjouterComp;
    private javax.swing.JTextArea TextAreaAjouterPers;
    private javax.swing.JButton buttonAjouterAjoutePers;
    private javax.swing.JButton buttonRetourAjoutePers;
    private javax.swing.JButton buttonSauvAjoutePers;
    private javax.swing.JComboBox<String> comboBoxCompAjoutePers1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAjoutePers;
    private javax.swing.JLabel labelCompAjoutePers;
    private javax.swing.JLabel labelDateEntAjoutePers;
    private javax.swing.JLabel labelNomAjoutePers;
    private javax.swing.JLabel labelPrenAjoutePers;
    private javax.swing.JTable tableAjouterPers;
    private javax.swing.JTextField textFieldDateEntreAjoutePers;
    private javax.swing.JTextField textFieldNomAjoutePers;
    private javax.swing.JTextField textFieldPreAjoutePers;
    // End of variables declaration//GEN-END:variables

}
