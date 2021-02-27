package Spryzu.ps98.frames;

import Spryzu.ps98.manager.PasswordManager;
import Spryzu.ps98.panels.PasswordsPanel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class PasswordGeneratorDialog extends javax.swing.JDialog 
{
    AddPasswordDialog dialogParent;
    PasswordsPanel panelParent;
    PasswordManager passwordManager;
    SpinnerModel spinnerModel = new SpinnerNumberModel(4, 4, 16, 1);
    
    public PasswordGeneratorDialog(java.awt.Frame parent, boolean modal, JDialog dialogParent, JPanel panelParent) 
    {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        passwordManager = new PasswordManager(false, false, false, false);
        this.dialogParent = (AddPasswordDialog) dialogParent;
        this.panelParent = (PasswordsPanel) panelParent;
        setIconImage(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98MiniLogo.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordField = new javax.swing.JTextField();
        passwordLengthSpinner = new javax.swing.JSpinner();
        numbersRButton = new javax.swing.JRadioButton();
        lowerCaseRButton = new javax.swing.JRadioButton();
        upperCaseRButton = new javax.swing.JRadioButton();
        symbolsRButton = new javax.swing.JRadioButton();
        generateButton = new javax.swing.JButton();
        strengthLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Passsword Saver 98 -Password Generator-");
        setResizable(false);

        passwordLengthSpinner.setModel(spinnerModel);

        generateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_GenerateButtonLogo.png"))); // NOI18N
        generateButton.setBorderPainted(false);
        generateButton.setFocusPainted(false);
        generateButton.setFocusable(false);
        generateButton.setOpaque(false);
        generateButton.setRequestFocusEnabled(false);
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        strengthLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_WeakLogo.png"))); // NOI18N

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_NumbersLogo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_LowerCaseLogo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_UpperCaseLogo.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_SymbolsLogo.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordLengthLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(strengthLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(passwordLengthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lowerCaseRButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(upperCaseRButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(numbersRButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(symbolsRButton)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numbersRButton)
                                .addGap(18, 18, 18)
                                .addComponent(lowerCaseRButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(upperCaseRButton))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(symbolsRButton)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordLengthSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(strengthLabel)
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        int length = (int) passwordLengthSpinner.getValue();
        boolean useLower = lowerCaseRButton.isSelected();
        boolean useUpper = upperCaseRButton.isSelected();
        boolean useDigits = numbersRButton.isSelected();
        boolean useSymbols = symbolsRButton.isSelected();
        
        if(!useLower && !useUpper && !useDigits && !useSymbols)
        {
            sendAlert("Select one option at least");
        }
        else
        {
            passwordManager.setUseDigits(useDigits);
            passwordManager.setUseLower(useLower);
            passwordManager.setUseUpper(useUpper);
            passwordManager.setUseSymbols(useSymbols);
            passwordField.setText(passwordManager.generatePassword(length));
            
            if(passwordManager.getPasswordStrength(length))
            {
                strengthLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_StrongLogo.png")));
            }
            else
            {
                strengthLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_WeakLogo.png")));
            }
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(panelParent == null)
        {
            dialogParent.passwordPField.setText(passwordField.getText());
            dispose();
        }
        else if(dialogParent == null)
        {
            panelParent.passwordPField.setText(passwordField.getText());
            dispose();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

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
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton lowerCaseRButton;
    private javax.swing.JRadioButton numbersRButton;
    private javax.swing.JTextField passwordField;
    private javax.swing.JSpinner passwordLengthSpinner;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel strengthLabel;
    private javax.swing.JRadioButton symbolsRButton;
    private javax.swing.JRadioButton upperCaseRButton;
    // End of variables declaration//GEN-END:variables
}
