package jFrames;

import java.sql.Connection;
import java.sql.SQLException;
import bean.RegisterIntoDB;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.CalculateSituation;

public class JIF_Register extends javax.swing.JInternalFrame {

    RegisterIntoDB registerDB = new RegisterIntoDB();
    CalculateSituation calculator = new CalculateSituation();
    
    public JIF_Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterIntoDbButton = new javax.swing.JButton();
        NameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        MathGradeField = new javax.swing.JTextField();
        HistoryGradeField = new javax.swing.JTextField();
        FisicsGradeField = new javax.swing.JTextField();
        NameLabel = new javax.swing.JLabel();
        FisicsGradeLabel = new javax.swing.JLabel();
        HistoryGradeLabel = new javax.swing.JLabel();
        MathGradeLabel = new javax.swing.JLabel();
        CourseLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        BirthLabel = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        CourseField = new javax.swing.JComboBox<>();
        BirthDateField = new javax.swing.JFormattedTextField();

        RegisterIntoDbButton.setText("Register Into Database");
        RegisterIntoDbButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterIntoDbButtonActionPerformed(evt);
            }
        });

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        FisicsGradeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FisicsGradeFieldActionPerformed(evt);
            }
        });

        NameLabel.setText("Name");

        FisicsGradeLabel.setText("Fisics Grade");

        HistoryGradeLabel.setText("History Grade");

        MathGradeLabel.setText("Math Grade");

        CourseLabel.setText("Course");

        EmailLabel.setText("E-mail");

        BirthLabel.setText("Birth Date");

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        CourseField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a course", "Técnico Informática", "Técnico Eletro Mecânica", "Técnico Química" }));

        BirthDateField.setText("  /  /");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BirthLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CourseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MathGradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HistoryGradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FisicsGradeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MathGradeField)
                            .addComponent(EmailField)
                            .addComponent(NameField)
                            .addComponent(FisicsGradeField)
                            .addComponent(HistoryGradeField)
                            .addComponent(CourseField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BirthDateField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RegisterIntoDbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BirthLabel)
                    .addComponent(BirthDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseLabel)
                    .addComponent(CourseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MathGradeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MathGradeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HistoryGradeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistoryGradeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FisicsGradeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FisicsGradeLabel))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterIntoDbButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void FisicsGradeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FisicsGradeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FisicsGradeFieldActionPerformed

    private void RegisterIntoDbButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterIntoDbButtonActionPerformed
        registerDB.setNome(NameField.getText());
        registerDB.setEmail(EmailField.getText()); 
        registerDB.setDataNas(BirthDateField.getText());
        registerDB.setCurso(CourseField.getSelectedItem().toString()); 
        registerDB.setMatematica(Double.valueOf(MathGradeField.getText()));
        registerDB.setHistoria(Double.valueOf(HistoryGradeField.getText()));
        registerDB.setFisica(Double.valueOf(FisicsGradeField.getText()));
        
        calculator.CalcGrades();
        calculator.CalcSituation();
        
        Connection conn = null;
        
        try {
            registerDB.InsertIntoDB(conn);
            JOptionPane.showConfirmDialog(rootPane, "The register was created succesfully!", "Message", WIDTH, JOptionPane.DEFAULT_OPTION);
        } catch (SQLException exception) {
            Logger.getLogger(JIF_Register.class.getName()).log(Level.SEVERE, null, exception);
            JOptionPane.showMessageDialog(rootPane, "Error during the register", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RegisterIntoDbButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField BirthDateField;
    private javax.swing.JLabel BirthLabel;
    private javax.swing.JComboBox<String> CourseField;
    private javax.swing.JLabel CourseLabel;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FisicsGradeField;
    private javax.swing.JLabel FisicsGradeLabel;
    private javax.swing.JTextField HistoryGradeField;
    private javax.swing.JLabel HistoryGradeLabel;
    private javax.swing.JTextField MathGradeField;
    private javax.swing.JLabel MathGradeLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton RegisterIntoDbButton;
    // End of variables declaration//GEN-END:variables
}
