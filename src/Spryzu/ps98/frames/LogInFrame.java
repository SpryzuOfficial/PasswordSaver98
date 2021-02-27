package Spryzu.ps98.frames;

import Spryzu.ps98.manager.OSPathsClass;
import Spryzu.ps98.manager.PasswordManager;
import Spryzu.ps98.panels.PasswordsPanel;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogInFrame extends javax.swing.JFrame 
{
    int nAttempts;
    int mode;
    PasswordManager passwordManager;
    PasswordsPanel passwordsPanel;
    
    public LogInFrame(int mode, JPanel passwordPanel) 
    {
        initComponents();
        passwordManager = new PasswordManager(false, false, false, false);
        this.mode = mode;
        this.passwordsPanel = (PasswordsPanel) passwordPanel;
        this.nAttempts = 0;
        setIconImage(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98MiniLogo.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        passwordPField = new javax.swing.JPasswordField();
        logInButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Password Saver 98 -Login-");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98MainLogo.png"))); // NOI18N

        passwordPField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        logInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ConfirmButtonLogo.png"))); // NOI18N
        logInButton.setBorderPainted(false);
        logInButton.setFocusPainted(false);
        logInButton.setFocusable(false);
        logInButton.setOpaque(false);
        logInButton.setRequestFocusEnabled(false);
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_MasterPasswordLogo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(passwordPField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        try 
        {
            String password = String.valueOf(passwordPField.getPassword());
            String decriptedPassword = passwordManager.decriptPassword(readPassword());
            
            if(password.equals(decriptedPassword))
            {
                JOptionPane.showMessageDialog(null, 
                                    "Login completed", 
                                    "Password Saver 98", 
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_NORMAL_Icon.png")));
                
                if(mode == PasswordManager.LOGIN_MODE_START_APP)
                {
                    MainAppFrame mainFrame = new MainAppFrame();
                    mainFrame.setVisible(true);
                    mainFrame.setLocationRelativeTo(null);
                    dispose();
                }
                else if(mode == PasswordManager.LOGIN_MODE_CHANGE_PASSWORD)
                {
                    dispose();
                    PasswordGeneratorDialog passwordGeneratorDialog = new PasswordGeneratorDialog(this, true, null, passwordsPanel);
                    passwordGeneratorDialog.setVisible(true);
                }
                else if(mode == PasswordManager.LOGIN_MODE_SHOW_PASSWORD)
                {
                    dispose();
                    ShowPasswordDialog showPasswordDialog = new ShowPasswordDialog(this, true, String.valueOf(passwordsPanel.passwordPField.getPassword()));
                    showPasswordDialog.setVisible(true);
                }
                else if(mode == PasswordManager.LOGIN_MODE_COPY_PASSWORD)
                {
                    Toolkit toolkit = Toolkit.getDefaultToolkit();
                    Clipboard clipboard = toolkit.getSystemClipboard();
                    StringSelection strSel = new StringSelection(String.valueOf(passwordsPanel.passwordPField.getPassword()));
                    clipboard.setContents(strSel, null);
                    
                    JOptionPane.showMessageDialog(null, 
                                    "Password has been copied to clipboard successfully (CTRL+V = Paste)", 
                                    "Password Saver 98", 
                                    JOptionPane.INFORMATION_MESSAGE, 
                                    new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_JOP_NORMAL_Icon.png")));
                    dispose();
                }
                else if(mode == PasswordManager.LOGIN_MODE_CHANGE_MASTER_PASSWORD)
                {
                    ConfigMasterPasswordFrame masterPasswordFrame = new ConfigMasterPasswordFrame(PasswordManager.MASTER_PASSWORD_MODE_CHANGE_MASTER_PASSWORD);
                    masterPasswordFrame.setVisible(true);
                    masterPasswordFrame.setLocationRelativeTo(null);    
                    
                    dispose();
                }
            }
            else
            {
                String[] configFile = readConfigFile();
                
                if(configFile[2].equals("1") && this.nAttempts == (Integer.parseInt(configFile[3]) - 1) && mode == PasswordManager.LOGIN_MODE_START_APP)
                {
                    sendAlert("The limit number of attempts to login is exceeded, " + 
                              "\n" + "Password Saver 98 will automatically lock");
                    
                    writeLockFile(configFile);
                    dispose();
                }
                else
                {
                    sendAlert("Incorrect password");
                    passwordPField.setText("");
                    this.nAttempts++;
                }
            }
        } 
        catch (Exception ex) 
        { 
            sendAlert("Error while reading master password");
        }
    }//GEN-LAST:event_logInButtonActionPerformed

    private void writeLockFile(String[] configFile) throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Calendar c = Calendar.getInstance();
 
        String date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").format(LocalDateTime.now());
        
        c.setTime(sdf.parse(date));
        c.add(Calendar.HOUR_OF_DAY, Integer.parseInt(configFile[5]));
        
        String calculatedDate = sdf.format(c.getTime());
        
        FileWriter fileWriter = new FileWriter(paths.LOCK_FILE_PATH);
        fileWriter.write(configFile[4] + "¡" + calculatedDate);
        fileWriter.close();
    }
    
    private String[] readConfigFile() throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        String fileContent;

        BufferedReader bReader = new BufferedReader(new FileReader(paths.CONFIG_FILE_PATH));
        fileContent = bReader.readLine();

        return fileContent.split("¡");
    }
    
    private String readPassword() throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        String encriptedPasword;
        
        BufferedReader bReader = new BufferedReader(new FileReader(paths.MASTER_PASSWORD_PATH));
        encriptedPasword = bReader.readLine();
        
        return encriptedPasword;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logInButton;
    private javax.swing.JPasswordField passwordPField;
    // End of variables declaration//GEN-END:variables
}
