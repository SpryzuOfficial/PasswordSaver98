package Spryzu.ps98.panels;

import Spryzu.ps98.frames.AddPasswordDialog;
import Spryzu.ps98.frames.IconsDialog;
import Spryzu.ps98.frames.LogInFrame;
import Spryzu.ps98.manager.OSPathsClass;
import Spryzu.ps98.manager.Password;
import Spryzu.ps98.manager.PasswordManager;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PasswordsPanel extends javax.swing.JPanel 
{
    Frame parent;
    public DefaultListModel<Password> listModel = new DefaultListModel<Password>();
    PasswordManager passwordManager;
    
    public PasswordsPanel(java.awt.Frame parent) 
    {
        initComponents();
        passwordManager = new PasswordManager(false, false, false, false);
        this.parent = parent;
        
        try
        {
            searchPasswords();
        }
        catch(Exception ex)
        { 
            sendAlert("Error opening password's folder");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        passwordsList = new javax.swing.JList<>();
        addPasswordButton = new javax.swing.JButton();
        removePasswordButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        iconLabel = new javax.swing.JLabel();
        editIconButton = new javax.swing.JButton();
        urlField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        savePasswordButton = new javax.swing.JButton();
        generatePaswordButton = new javax.swing.JButton();
        showPasswordButton = new javax.swing.JButton();
        passwordPField = new javax.swing.JPasswordField();
        resetValuesButton = new javax.swing.JButton();
        copyPasswordButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 500));

        passwordsList.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        passwordsList.setModel(listModel);
        passwordsList.addListSelectionListener(new ListSelectionListener() 
            {

                @Override
                public void valueChanged(ListSelectionEvent arg0) 
                {
                    if (!arg0.getValueIsAdjusting())
                    {
                        Password password = passwordsList.getSelectedValue();
                        if(password == null)
                        {
                            nameField.setText("");
                            urlField.setText("");
                            usernameField.setText("");
                            passwordPField.setText("");
                            iconLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_EmptyLogo.png")));
                            return;
                        }

                        String[] configFile = readConfigFile();

                        ImageIcon image = new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/" + password.getIcon()));
                        String[] date = password.getDate().split("/");
                        int dateCalculatedInt = Integer.parseInt(DateTimeFormatter.ofPattern("MM").format(LocalDateTime.now()));

                        nameField.setText(password.getName());
                        urlField.setText(password.getUrl());
                        usernameField.setText(password.getUsername());
                        passwordPField.setText(password.getPassword());
                        iconLabel.setIcon(image);

                        if(configFile[0].equals("1"))
                        {
                            if(Math.abs(Integer.parseInt(date[1]) - dateCalculatedInt) >= Integer.parseInt(configFile[1]))
                            {
                                Toolkit.getDefaultToolkit().beep();
                                if(JOptionPane.showConfirmDialog(
                                    null, 
                                    "Your password has not been updated for " + Math.abs(Integer.parseInt(date[1]) - dateCalculatedInt) + " months " + 
                                    "\n" + "it is recommended to update it immediately", 
                                    "Password Saver 98",
                                    JOptionPane.YES_NO_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_ALERT_Icon.png"))) == 0)
                            {
                                openLoginDialog(PasswordManager.LOGIN_MODE_CHANGE_PASSWORD);
                            }
                        }
                    } 
                }
            }
        });
        add(passwordsList);

        setVisible(true);
        jScrollPane1.setViewportView(passwordsList);

        addPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_AddButtonLogo.png"))); // NOI18N
        addPasswordButton.setBorderPainted(false);
        addPasswordButton.setFocusPainted(false);
        addPasswordButton.setFocusable(false);
        addPasswordButton.setOpaque(false);
        addPasswordButton.setRequestFocusEnabled(false);
        addPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPasswordButtonActionPerformed(evt);
            }
        });

        removePasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_DeleteButtonLogo.png"))); // NOI18N
        removePasswordButton.setBorderPainted(false);
        removePasswordButton.setFocusPainted(false);
        removePasswordButton.setFocusable(false);
        removePasswordButton.setOpaque(false);
        removePasswordButton.setRequestFocusEnabled(false);
        removePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePasswordButtonActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_EmptyLogo.png"))); // NOI18N

        editIconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_EditButtonIcon.png"))); // NOI18N
        editIconButton.setBorderPainted(false);
        editIconButton.setFocusPainted(false);
        editIconButton.setFocusable(false);
        editIconButton.setOpaque(false);
        editIconButton.setRequestFocusEnabled(false);
        editIconButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editIconButtonActionPerformed(evt);
            }
        });

        urlField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        usernameField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        savePasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_SaveButtonLogo.png"))); // NOI18N
        savePasswordButton.setBorderPainted(false);
        savePasswordButton.setFocusPainted(false);
        savePasswordButton.setFocusable(false);
        savePasswordButton.setOpaque(false);
        savePasswordButton.setRequestFocusEnabled(false);
        savePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePasswordButtonActionPerformed(evt);
            }
        });

        generatePaswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_GenerateMiniButtonLogo.png"))); // NOI18N
        generatePaswordButton.setBorderPainted(false);
        generatePaswordButton.setFocusPainted(false);
        generatePaswordButton.setFocusable(false);
        generatePaswordButton.setOpaque(false);
        generatePaswordButton.setRequestFocusEnabled(false);
        generatePaswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePaswordButtonActionPerformed(evt);
            }
        });

        showPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ViewPasswordButtonLogo.png"))); // NOI18N
        showPasswordButton.setBorderPainted(false);
        showPasswordButton.setFocusPainted(false);
        showPasswordButton.setFocusable(false);
        showPasswordButton.setOpaque(false);
        showPasswordButton.setRequestFocusEnabled(false);
        showPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordButtonActionPerformed(evt);
            }
        });

        passwordPField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        passwordPField.setEnabled(false);

        resetValuesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ResetValuesButtonLogo.png"))); // NOI18N
        resetValuesButton.setBorderPainted(false);
        resetValuesButton.setFocusPainted(false);
        resetValuesButton.setFocusable(false);
        resetValuesButton.setOpaque(false);
        resetValuesButton.setRequestFocusEnabled(false);
        resetValuesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetValuesButtonActionPerformed(evt);
            }
        });

        copyPasswordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_CopyPasswordButtonLogo.png"))); // NOI18N
        copyPasswordButton.setBorderPainted(false);
        copyPasswordButton.setFocusPainted(false);
        copyPasswordButton.setFocusable(false);
        copyPasswordButton.setOpaque(false);
        copyPasswordButton.setRequestFocusEnabled(false);
        copyPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyPasswordButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordNameLogo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordURLLogo.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordUsernameLogo.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordPasswordLogo.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_PasswordLogoLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(savePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(133, 133, 133)
                            .addComponent(resetValuesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(editIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                .addComponent(urlField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(passwordPField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generatePaswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(copyPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(removePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(editIconButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordPField)
                            .addComponent(generatePaswordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPasswordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(copyPasswordButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetValuesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(savePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPasswordButtonActionPerformed
        AddPasswordDialog addPasswordDialog = new AddPasswordDialog(parent, true);
        addPasswordDialog.setVisible(true);
    }//GEN-LAST:event_addPasswordButtonActionPerformed

    private void removePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePasswordButtonActionPerformed
        Password password = passwordsList.getSelectedValue();
        
        if(password == null) return;
        
        Toolkit.getDefaultToolkit().beep();
        if(JOptionPane.showConfirmDialog(null, "The password will be deleted, are you sure?", "Password Saver 98", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_ALERT_Icon.png"))) == 0)
        {
            try
            {
                deletePassword(password);
                int passwordId = passwordsList.getSelectedIndex();
                listModel.removeElementAt(passwordId);
            }
            catch(Exception ex)
            { 
                sendAlert("Error while reading the configurations file");
            }
        }
    }//GEN-LAST:event_removePasswordButtonActionPerformed

    private void resetValuesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetValuesButtonActionPerformed
        passwordsList.clearSelection();
    }//GEN-LAST:event_resetValuesButtonActionPerformed

    private void generatePaswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePaswordButtonActionPerformed
        if(passwordsList.getSelectedValue() == null) return;
        
        openLoginDialog(PasswordManager.LOGIN_MODE_CHANGE_PASSWORD);
    }//GEN-LAST:event_generatePaswordButtonActionPerformed

    private void showPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordButtonActionPerformed
        if(passwordsList.getSelectedValue() == null) return;
        
        openLoginDialog(PasswordManager.LOGIN_MODE_SHOW_PASSWORD);
    }//GEN-LAST:event_showPasswordButtonActionPerformed

    private void copyPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyPasswordButtonActionPerformed
        if(passwordsList.getSelectedValue() == null) return;
        
        openLoginDialog(PasswordManager.LOGIN_MODE_COPY_PASSWORD);
    }//GEN-LAST:event_copyPasswordButtonActionPerformed

    private void savePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePasswordButtonActionPerformed
        Password password = passwordsList.getSelectedValue();
        if(password == null) return;
        
        try 
        {
            OSPathsClass paths = new OSPathsClass();
            String passwordFileName = password.getName() + password.getUsername();
            String date = DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now());
            
            if(!new File(paths.PASSWORDS_FOLDER_PATH + passwordFileName + ".ps98C").exists())
            {
                deletePassword(password);
                savePassword(nameField.getText(), urlField.getText(), usernameField.getText(), String.valueOf(passwordPField.getPassword()), iconLabel.getIcon().toString().substring(iconLabel.getIcon().toString().lastIndexOf("/") + 1), date);
                searchPasswords();
                
                JOptionPane.showMessageDialog(null, 
                                    "Password saved", 
                                    "Password Saver 98", 
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_NORMAL_Icon.png")));

            }
        }
        catch (Exception ex) 
        { 
            sendAlert("Error saving password");
        }
    }//GEN-LAST:event_savePasswordButtonActionPerformed

    private void editIconButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editIconButtonActionPerformed
        if(passwordsList.getSelectedValue() == null) return;
        
        IconsDialog iconsDialog = new IconsDialog(parent, true, "/Spryzu/ps98/src/images/" + iconLabel.getIcon().toString().substring(iconLabel.getIcon().toString().lastIndexOf("/") + 1), null, this);
        iconsDialog.setVisible(true);
    }//GEN-LAST:event_editIconButtonActionPerformed

    private void openLoginDialog(int mode)
    {
        LogInFrame loginFrame = new LogInFrame(mode, this);
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
    }
    
    private String[] readConfigFile()
    {
        try
        {
            OSPathsClass paths = new OSPathsClass();
            String fileContent;

            BufferedReader bReader = new BufferedReader(new FileReader(paths.CONFIG_FILE_PATH));
            fileContent = bReader.readLine();

            return fileContent.split("¡");
        }
        catch(Exception ex)
        { 
            sendAlert("Error reading configurations file");
            return null; 
        }
    }
    
    private void searchPasswords() throws Exception
    {
        listModel.clear();
        
        OSPathsClass paths = new OSPathsClass();
        File folder = new File(paths.PASSWORDS_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles)
        {
            try 
            {
                readPasswordFile(file);
            } 
            catch (Exception ex) 
            { 
                sendAlert("Error reading the password in " + file.getAbsolutePath() + " path");
            }
        }
    }
    
    private void savePassword(String name, String url, String username, String password, String icon, String date) throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        String encriptedPassword = passwordManager.encriptPassword(password);
        
        FileWriter fileWriter = new FileWriter(paths.PASSWORDS_PATH + nameField.getText() + usernameField.getText() + ".ps98C");
        fileWriter.write(name + "¡" + url + "¡" + username + "¡" + encriptedPassword + "¡" + icon + "¡" + date);
        fileWriter.close();
    }
    
    private void deletePassword(Password password) throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        String fileName = password.getName() + password.getUsername();
        
        File folder = new File(paths.PASSWORDS_FOLDER_PATH);
        File[] listOfFiles = folder.listFiles();
        
        for (File file : listOfFiles)
        {   
            if(file.getName().equals(fileName + ".ps98C"))
            {
                System.gc(); 
                boolean result = file.delete(); 
                
                if (!result)
                { 
                    try 
                    { 
                        Thread.sleep(100);
                    } 
                    catch (InterruptedException ex) 
                    {
                        sendAlert("Error removing password");
                    }
                    System.gc();
                    result = file.delete(); 
                }
            }
        }
    }

    private void readPasswordFile(File file) throws Exception
    {
        Password password = new Password("", "", "", "", "", "");
        String fileContent;
        String[] fileElements;
        
        BufferedReader bReader = new BufferedReader(new FileReader(file));
        fileContent = bReader.readLine();
        
        fileElements = fileContent.split("¡");
        password.setName(fileElements[0]);
        password.setUrl(fileElements[1]);
        password.setUsername(fileElements[2]);
        password.setPassword(passwordManager.decriptPassword(fileElements[3]));
        password.setIcon(fileElements[4]);
        password.setDate(fileElements[5]);
        
        listModel.addElement(password);
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
    private javax.swing.JButton addPasswordButton;
    private javax.swing.JButton copyPasswordButton;
    private javax.swing.JButton editIconButton;
    private javax.swing.JButton generatePaswordButton;
    public javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    public javax.swing.JPasswordField passwordPField;
    private javax.swing.JList<Password> passwordsList;
    private javax.swing.JButton removePasswordButton;
    private javax.swing.JButton resetValuesButton;
    private javax.swing.JButton savePasswordButton;
    private javax.swing.JButton showPasswordButton;
    private javax.swing.JTextField urlField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
