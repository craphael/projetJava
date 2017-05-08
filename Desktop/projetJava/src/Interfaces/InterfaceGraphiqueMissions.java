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
public class InterfaceGraphiqueMissions extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceGraphiqueMissions
     */
    public InterfaceGraphiqueMissions() {
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

        labelMissionsMission = new javax.swing.JLabel();
        labelTypeMission = new javax.swing.JLabel();
        buttonRechMissions = new javax.swing.JButton();
        comboBoxMTypeMissions = new javax.swing.JComboBox<>();
        labelNomMissions = new javax.swing.JLabel();
        labelDateDebMissions = new javax.swing.JLabel();
        textFieldNomMissions = new javax.swing.JTextField();
        textFieldDateDebMissions = new javax.swing.JTextField();
        separatorMissions = new javax.swing.JSeparator();
        tableMissions = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonAjouterMissions = new javax.swing.JButton();
        buttonModifierMissions = new javax.swing.JButton();
        buttonRetourMissions = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMissionsMission.setText("Missions");

        labelTypeMission.setText("Type de Mission :");

        buttonRechMissions.setText("Rechercher");

        comboBoxMTypeMissions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MissionPlanifiée", "MissionPlanification", "MissionEnCours", "MissionTerminée" }));

        labelNomMissions.setText("Nom :");

        labelDateDebMissions.setText("Date Début :");

        textFieldNomMissions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomMissionsActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nom", "Nombre Personne", "Date Début", "Durée"
            }
        ));
        tableMissions.setViewportView(jTable1);

        buttonAjouterMissions.setText("Ajouter");

        buttonModifierMissions.setText("Modifier");
        buttonModifierMissions.setEnabled(false);

        buttonRetourMissions.setText("Retour");
        buttonRetourMissions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonRetourMissionsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorMissions)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAjouterMissions)
                        .addGap(57, 57, 57)
                        .addComponent(buttonModifierMissions)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRetourMissions))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(labelMissionsMission))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(buttonRechMissions))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(labelNomMissions, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldNomMissions, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(labelDateDebMissions)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textFieldDateDebMissions, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelTypeMission)
                                        .addGap(38, 38, 38)
                                        .addComponent(comboBoxMTypeMissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(tableMissions, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMissionsMission)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTypeMission)
                    .addComponent(comboBoxMTypeMissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomMissions)
                    .addComponent(labelDateDebMissions)
                    .addComponent(textFieldNomMissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDateDebMissions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRechMissions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorMissions, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableMissions, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonAjouterMissions)
                            .addComponent(buttonModifierMissions))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonRetourMissions))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNomMissionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomMissionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomMissionsActionPerformed

    private void buttonRetourMissionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonRetourMissionsMouseClicked
        // TODO add your handling code here:
        interfaceGraphiqueAccueil  Accueil = new interfaceGraphiqueAccueil();
        this.dispose();
        Accueil.setVisible(true);
    }//GEN-LAST:event_buttonRetourMissionsMouseClicked

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
            java.util.logging.Logger.getLogger(InterfaceGraphiqueMissions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphiqueMissions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphiqueMissions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphiqueMissions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGraphiqueMissions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAjouterMissions;
    private javax.swing.JButton buttonModifierMissions;
    private javax.swing.JButton buttonRechMissions;
    private javax.swing.JButton buttonRetourMissions;
    private javax.swing.JComboBox<String> comboBoxMTypeMissions;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDateDebMissions;
    private javax.swing.JLabel labelMissionsMission;
    private javax.swing.JLabel labelNomMissions;
    private javax.swing.JLabel labelTypeMission;
    private javax.swing.JSeparator separatorMissions;
    private javax.swing.JScrollPane tableMissions;
    private javax.swing.JTextField textFieldDateDebMissions;
    private javax.swing.JTextField textFieldNomMissions;
    // End of variables declaration//GEN-END:variables
}