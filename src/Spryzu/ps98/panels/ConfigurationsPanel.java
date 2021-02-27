package Spryzu.ps98.panels;

import Spryzu.ps98.frames.LogInFrame;
import Spryzu.ps98.manager.OSPathsClass;
import Spryzu.ps98.manager.PasswordManager;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class ConfigurationsPanel extends javax.swing.JPanel 
{
    SpinnerModel nAttemptsSpinnerModel = new SpinnerNumberModel(2, 2, 5, 1);
    SpinnerModel lockTimeSpinnerModel = new SpinnerNumberModel(1, 1, 24, 1);
    
    public ConfigurationsPanel() 
    {
        initComponents();
        
        try
        {
            readConfigFile();
        }
        catch(Exception ex)
        { 
            sendAlert("Error reading configurations file");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeMasterPasswordButton = new javax.swing.JButton();
        passwordUpdatesCheckBox = new javax.swing.JCheckBox();
        updatesFComboBox = new javax.swing.JComboBox<>();
        lockAfterAtteptsCheckBox = new javax.swing.JCheckBox();
        nAttemptsSpinner = new javax.swing.JSpinner();
        lockTypeComboBox = new javax.swing.JComboBox<>();
        lockTimeSpinner = new javax.swing.JSpinner();
        saveButton = new javax.swing.JButton();
        resetDefButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 500));

        changeMasterPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ChangeMasterPasswordButtonLogo.png"))); // NOI18N
        changeMasterPasswordButton.setBorderPainted(false);
        changeMasterPasswordButton.setFocusPainted(false);
        changeMasterPasswordButton.setFocusable(false);
        changeMasterPasswordButton.setOpaque(false);
        changeMasterPasswordButton.setRequestFocusEnabled(false);
        changeMasterPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeMasterPasswordButtonActionPerformed(evt);
            }
        });

        passwordUpdatesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordUpdatesCheckBoxActionPerformed(evt);
            }
        });

        updatesFComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        lockAfterAtteptsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockAfterAtteptsCheckBoxActionPerformed(evt);
            }
        });

        nAttemptsSpinner.setModel(nAttemptsSpinnerModel);

        lockTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "Permanent" }));
        lockTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lockTypeComboBoxActionPerformed(evt);
            }
        });

        lockTimeSpinner.setModel(lockTimeSpinnerModel);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_SaveButtonLogo.png"))); // NOI18N
        saveButton.setBorderPainted(false);
        saveButton.setFocusPainted(false);
        saveButton.setFocusable(false);
        saveButton.setOpaque(false);
        saveButton.setRequestFocusEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        resetDefButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ResetToDefaultButtonLogo.png"))); // NOI18N
        resetDefButton.setBorderPainted(false);
        resetDefButton.setFocusable(false);
        resetDefButton.setOpaque(false);
        resetDefButton.setRequestFocusEnabled(false);
        resetDefButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetDefButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_RememberPasswordUpdatesButtonLogo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_LockAffterNAttemptsButtonLogo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_UpdatesFrecuenzeButtonLogo.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_MonthsLogo.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_NAtteptsBeforeLockButtonLogo.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_LockTypeButtonLogo.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_LockTimeButtonLogo.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_HRSLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(resetDefButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(changeMasterPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lockTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(nAttemptsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updatesFComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(passwordUpdatesCheckBox)
                            .addComponent(lockAfterAtteptsCheckBox)
                            .addComponent(lockTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(changeMasterPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(passwordUpdatesCheckBox))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addComponent(updatesFComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lockAfterAtteptsCheckBox)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nAttemptsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(lockTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lockTimeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetDefButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeMasterPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeMasterPasswordButtonActionPerformed
        LogInFrame logInFrame = new LogInFrame(PasswordManager.LOGIN_MODE_CHANGE_MASTER_PASSWORD, null);
        logInFrame.setVisible(true);
        logInFrame.setLocationRelativeTo(null);
    }//GEN-LAST:event_changeMasterPasswordButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try
        {
            writeConfigFile();
            JOptionPane.showMessageDialog(null, 
                                    "Configurations saved", 
                                    "Password Saver 98", 
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_NORMAL_Icon.png")));
        }
        catch(Exception ex)
        { 
            sendAlert("Error saving configurations");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void passwordUpdatesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordUpdatesCheckBoxActionPerformed
        if(passwordUpdatesCheckBox.isSelected())
        {
            updatesFComboBox.setEnabled(true);
        }
        else
        {
            updatesFComboBox.setEnabled(false);
        }
    }//GEN-LAST:event_passwordUpdatesCheckBoxActionPerformed

    private void lockAfterAtteptsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockAfterAtteptsCheckBoxActionPerformed
        if(lockAfterAtteptsCheckBox.isSelected())
        {
            lockTypeComboBox.setEnabled(true);
            nAttemptsSpinner.setEnabled(true);
            lockTimeSpinner.setEnabled(true);
        }
        else
        {
            lockTypeComboBox.setEnabled(false);
            nAttemptsSpinner.setEnabled(false);
            lockTimeSpinner.setEnabled(false);
        }
    }//GEN-LAST:event_lockAfterAtteptsCheckBoxActionPerformed

    private void lockTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lockTypeComboBoxActionPerformed
        if(lockTypeComboBox.getSelectedItem().equals("Time"))
        {
            lockTimeSpinner.setEnabled(true);
        }
        else
        {
            lockTimeSpinner.setEnabled(false);
        }
    }//GEN-LAST:event_lockTypeComboBoxActionPerformed

    private void resetDefButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetDefButtonActionPerformed
        passwordUpdatesCheckBox.setSelected(true);
        updatesFComboBox.setSelectedItem("1");
        lockAfterAtteptsCheckBox.setSelected(true);
        nAttemptsSpinner.setValue(3);
        lockTypeComboBox.setSelectedItem("Time");
        lockTimeSpinner.setValue(2);
        
        updatesFComboBox.setEnabled(true);
        nAttemptsSpinner.setEnabled(true);
        lockTypeComboBox.setEnabled(true);
        lockTimeSpinner.setEnabled(true);
    }//GEN-LAST:event_resetDefButtonActionPerformed

    private void writeConfigFile() throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        
        String updatesBox = passwordUpdatesCheckBox.isSelected() ? "1" : "0";
        String updatesF = (String) updatesFComboBox.getSelectedItem();
        String lockBox = lockAfterAtteptsCheckBox.isSelected() ? "1" : "0";
        String nAttempts = String.valueOf(nAttemptsSpinner.getValue());
        String lockType = lockTypeComboBox.getSelectedItem().equals("Time") ? "0" : "1";
        String lockTime = String.valueOf(lockTimeSpinner.getValue());
        
        FileWriter configFile = new FileWriter(paths.CONFIG_FILE_PATH);
        configFile.write(updatesBox + "¡" + updatesF + "¡" + lockBox + "¡" + nAttempts + "¡" + lockType + "¡" + lockTime);
        configFile.close();
    }
    
    private void readConfigFile() throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        String fileContent;
        String[] fileElements;
        
        BufferedReader bReader = new BufferedReader(new FileReader(paths.CONFIG_FILE_PATH));
        fileContent = bReader.readLine();
        
        fileElements = fileContent.split("¡");
        
        if(fileElements[0].equals("1"))
        {
            passwordUpdatesCheckBox.setSelected(true);
            updatesFComboBox.setEnabled(true);
        }
        else
        {
            passwordUpdatesCheckBox.setSelected(false);
            updatesFComboBox.setEnabled(false);
        }
        
        updatesFComboBox.setSelectedItem(fileElements[1]);
        
        if(fileElements[2].equals("1"))
        {
            lockAfterAtteptsCheckBox.setSelected(true);
            lockTypeComboBox.setEnabled(true);
            nAttemptsSpinner.setEnabled(true);
            lockTimeSpinner.setEnabled(true);
        }
        else
        {
            lockAfterAtteptsCheckBox.setSelected(false);
            lockTypeComboBox.setEnabled(false);
            nAttemptsSpinner.setEnabled(false);
            lockTimeSpinner.setEnabled(false);
        }
        
        nAttemptsSpinner.setValue(Integer.parseInt(fileElements[3]));
        
        lockTypeComboBox.setSelectedItem(fileElements[4].equals("0") ? "Time" : "Permanent");
        
        if(lockTypeComboBox.getSelectedItem().equals("1"))
        {
            lockTimeSpinner.setEnabled(false);
        }
        
        lockTimeSpinner.setValue(Integer.parseInt(fileElements[5]));
    }
    
    private void sendAlert(String message)
    {
        Toolkit.getDefaultToolkit().beep();
        JOptionPane.showMessageDialog(
                null, 
                message, 
                "Error", 
                JOptionPane.INFORMATION_MESSAGE, 
                new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_ERROR_Icon.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeMasterPasswordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JCheckBox lockAfterAtteptsCheckBox;
    private javax.swing.JSpinner lockTimeSpinner;
    private javax.swing.JComboBox<String> lockTypeComboBox;
    private javax.swing.JSpinner nAttemptsSpinner;
    private javax.swing.JCheckBox passwordUpdatesCheckBox;
    private javax.swing.JButton resetDefButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> updatesFComboBox;
    // End of variables declaration//GEN-END:variables
}
