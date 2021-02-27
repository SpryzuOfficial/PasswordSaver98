package Spryzu.ps98.frames;

import Spryzu.ps98.manager.OSPathsClass;
import Spryzu.ps98.manager.Password;
import Spryzu.ps98.manager.PasswordManager;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddPasswordDialog extends javax.swing.JDialog 
{
    MainAppFrame parent;
    PasswordManager passwordManager;
    
    public AddPasswordDialog(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);
        initComponents();
        passwordManager = new PasswordManager(false, false, false, false);
        this.parent = (MainAppFrame) parent;
        setIconImage(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98MiniLogo.png")).getImage());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameField = new javax.swing.JTextField();
        urlField = new javax.swing.JTextField();
        iconButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        passwordPField = new javax.swing.JPasswordField();
        generatePasswordButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Password Saver 98 -Add Password-");
        setResizable(false);

        nameField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        urlField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_EmptyLogo.png"))); // NOI18N
        iconButton.setBorderPainted(false);
        iconButton.setFocusPainted(false);
        iconButton.setFocusable(false);
        iconButton.setOpaque(false);
        iconButton.setRequestFocusEnabled(false);
        iconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iconButtonActionPerformed(evt);
            }
        });

        usernameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        passwordPField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        generatePasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_GenerateMiniButtonLogo.png"))); // NOI18N
        generatePasswordButton.setBorderPainted(false);
        generatePasswordButton.setFocusPainted(false);
        generatePasswordButton.setFocusable(false);
        generatePasswordButton.setOpaque(false);
        generatePasswordButton.setRequestFocusEnabled(false);
        generatePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePasswordButtonActionPerformed(evt);
            }
        });

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordNameLogo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordLogoLogo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordURLLogo.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordUsernameLogo.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordPasswordLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordPField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generatePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(iconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(urlField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(usernameField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordPField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generatePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if(iconButton.getIcon().toString().substring(iconButton.getIcon().toString().lastIndexOf("/") + 1).equals("PasswordSaver98_EmptyLogo.png"))
        {
            sendAlert("Please select an icon");
            return;
        }
        
        String name = nameField.getText();
        String url = urlField.getText();
        String username = usernameField.getText();
        String password = String.valueOf(passwordPField.getPassword());
        String icon = iconButton.getIcon().toString().substring(iconButton.getIcon().toString().lastIndexOf("/") + 1);
        String date = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now());
        
        if(name.equals("") || url.equals("") || username.equals("") || password.equals(""))
        {
            sendAlert("Please fill all the fields");
        }
        else
        {
            try
            {
                savePassword(name, url, username, password, icon, date);
                Password passwordObject = new Password(name, url, username, password, icon, date);
                parent.passwordsPanel.listModel.addElement(passwordObject);
                
                JOptionPane.showMessageDialog(null, 
                                    "Password saved", 
                                    "Password Saver 98", 
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_NORMAL_Icon.png")));
                dispose();
            } 
            catch (Exception ex) 
            { 
                sendAlert("Error saving password");
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void generatePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePasswordButtonActionPerformed
        PasswordGeneratorDialog passwordGeneratorDialog = new PasswordGeneratorDialog(null, true, this, null);
        passwordGeneratorDialog.setVisible(true);
    }//GEN-LAST:event_generatePasswordButtonActionPerformed

    private void iconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iconButtonActionPerformed
        IconsDialog iconsDialog = new IconsDialog(parent, true, "/Spryzu/ps98/src/images/PasswordSaver98_MailLogo.png", this, null);
        iconsDialog.setVisible(true);
    }//GEN-LAST:event_iconButtonActionPerformed

    private void savePassword(String name, String url, String username, String password, String icon, String date) throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        String encriptedPassword = passwordManager.encriptPassword(password);
        
        FileWriter fileWriter = new FileWriter(paths.PASSWORDS_PATH + nameField.getText() + usernameField.getText() + ".ps98C");
        fileWriter.write(name + "¡" + url + "¡" + username + "¡" + encriptedPassword + "¡" + icon + "¡" + date);
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
    private javax.swing.JButton generatePasswordButton;
    public javax.swing.JButton iconButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameField;
    public javax.swing.JPasswordField passwordPField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField urlField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
