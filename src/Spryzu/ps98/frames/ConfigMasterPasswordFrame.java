package Spryzu.ps98.frames;

import Spryzu.ps98.manager.OSPathsClass;
import Spryzu.ps98.manager.PasswordManager;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConfigMasterPasswordFrame extends javax.swing.JFrame 
{
    int mode;
    PasswordManager passwordManager;
    
    public ConfigMasterPasswordFrame(int mode) 
    {
        initComponents();
        passwordManager = new PasswordManager(false, false, false, false);
        this.mode = mode;
        setIconImage(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98MiniLogo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterPasswordPField = new javax.swing.JPasswordField();
        confirmPasswordPField = new javax.swing.JPasswordField();
        confirmButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" Password Saver 98 -Master Password-");
        setResizable(false);

        enterPasswordPField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        confirmPasswordPField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ConfirmButtonLogo.png"))); // NOI18N
        confirmButton.setBorderPainted(false);
        confirmButton.setFocusPainted(false);
        confirmButton.setFocusable(false);
        confirmButton.setRequestFocusEnabled(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98MainLogo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_MasterPasswordLogo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ConfirmMasterPasswordLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(confirmPasswordPField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(enterPasswordPField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterPasswordPField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordPField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String passwordField1 = String.valueOf(enterPasswordPField.getPassword());
        String passwordFiled2 = String.valueOf(confirmPasswordPField.getPassword());
        
        if(passwordField1.equals("") || passwordFiled2.equals(""))
        {
            sendAlert("Please fill all the fields");
        }
        else
        {
            if(passwordField1.equals(passwordFiled2))
            {
                try 
                {
                    if(mode == PasswordManager.MASTER_PASSWORD_MODE_CREATE_MASTER_PASSWORD)
                    {
                        createFolders();
                        savePassword();
                        JOptionPane.showMessageDialog(null, 
                                    "Password Saved", 
                                    "Password Saver 98", 
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_NORMAL_Icon.png")));

                        MainAppFrame mainFrame = new MainAppFrame();
                        mainFrame.setVisible(true);
                        mainFrame.setLocationRelativeTo(null);
                        dispose();
                    }
                    else if(mode == PasswordManager.MASTER_PASSWORD_MODE_CHANGE_MASTER_PASSWORD)
                    {
                        savePassword();
                        JOptionPane.showMessageDialog(null, 
                                    "Password Saved", 
                                    "Password Saver 98", 
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_NORMAL_Icon.png")));
                        
                        dispose();
                    }
                } 
                catch (Exception ex) 
                {
                    sendAlert("Error saving master password");
                }
            }
            else
            {
                sendAlert("Passwords don't match");
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void createFolders() throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        
        File masterPasswordFolderPath = new File(paths.MASTER_PASSWORD_FOLDER_PATH);
        File passwordsFolderPath = new File(paths.PASSWORDS_FOLDER_PATH);
        
        masterPasswordFolderPath.mkdir();
        passwordsFolderPath.mkdir();
        
        FileWriter configFile = new FileWriter(paths.CONFIG_FILE_PATH);
        configFile.write("1¡1¡1¡3¡0¡2");
        configFile.close();
    }
    
    private void savePassword() throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        
        String password = String.valueOf(confirmPasswordPField.getPassword());
        String encriptedPassword = passwordManager.encriptPassword(password);
        
        FileWriter fileWriter = new FileWriter(paths.MASTER_PASSWORD_PATH);
        fileWriter.write(encriptedPassword);
        fileWriter.close();
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
    private javax.swing.JButton confirmButton;
    public javax.swing.JPasswordField confirmPasswordPField;
    private javax.swing.JPasswordField enterPasswordPField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
