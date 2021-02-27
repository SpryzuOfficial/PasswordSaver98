package Spryzu.ps98.frames;

import Spryzu.ps98.panels.PasswordsPanel;
import javax.swing.ImageIcon;

public class IconsDialog extends javax.swing.JDialog 
{
    AddPasswordDialog parentPasswordDialog;
    PasswordsPanel parentPasswordPanel;
            
    public IconsDialog(java.awt.Frame parent, boolean modal, String imagePath, AddPasswordDialog parentPasswordDialog, PasswordsPanel parentPasswordPanel) 
    {
        super(parent, modal);
        initComponents();
        logoLabel.setIcon(new ImageIcon(getClass().getResource(imagePath)));
        this.parentPasswordDialog = parentPasswordDialog;
        this.parentPasswordPanel = parentPasswordPanel;
        setIconImage(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98MiniLogo.png")).getImage());
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        logo1Button = new javax.swing.JButton();
        logo2Button = new javax.swing.JButton();
        logo3Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Password Saver 98 -Select Icon-");
        setResizable(false);

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

        logo1Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_FacebookLogo.png"))); // NOI18N
        logo1Button.setBorderPainted(false);
        logo1Button.setFocusPainted(false);
        logo1Button.setFocusable(false);
        logo1Button.setOpaque(false);
        logo1Button.setRequestFocusEnabled(false);
        logo1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logo1ButtonActionPerformed(evt);
            }
        });

        logo2Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_YoutubeLogo.png"))); // NOI18N
        logo2Button.setBorderPainted(false);
        logo2Button.setFocusPainted(false);
        logo2Button.setFocusable(false);
        logo2Button.setOpaque(false);
        logo2Button.setRequestFocusEnabled(false);
        logo2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logo2ButtonActionPerformed(evt);
            }
        });

        logo3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ShopCarIcon.png"))); // NOI18N
        logo3Button.setBorderPainted(false);
        logo3Button.setFocusPainted(false);
        logo3Button.setFocusable(false);
        logo3Button.setOpaque(false);
        logo3Button.setRequestFocusEnabled(false);
        logo3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logo3ButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98MainLogo.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_MailLogo.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_InstagramLogo.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_TwitterLogo.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setOpaque(false);
        jButton3.setRequestFocusEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_AmazonLogo.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setOpaque(false);
        jButton4.setRequestFocusEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_GameIcon.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setOpaque(false);
        jButton5.setRequestFocusEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logo3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(logo1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(logo2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logo1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(logo2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(logo3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logo1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logo1ButtonActionPerformed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_FacebookLogo.png")));
    }//GEN-LAST:event_logo1ButtonActionPerformed

    private void logo2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logo2ButtonActionPerformed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_YoutubeLogo.png")));
    }//GEN-LAST:event_logo2ButtonActionPerformed

    private void logo3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logo3ButtonActionPerformed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_ShopCarIcon.png")));
    }//GEN-LAST:event_logo3ButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        String iconfilename = logoLabel.getIcon().toString();
        String fileName = iconfilename.substring(iconfilename.lastIndexOf("/") + 1);
        
        if(parentPasswordPanel == null)
        {
            parentPasswordDialog.iconButton.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/" + fileName)));
        }
        else if(parentPasswordDialog == null)
        {
            parentPasswordPanel.iconLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/" + fileName)));
        }
        
        dispose();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_MailLogo.png")));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_InstagramLogo.png")));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_TwitterLogo.png")));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_AmazonLogo.png")));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        logoLabel.setIcon(new ImageIcon(getClass().getResource("/Spryzu/ps98/src/images/PasswordSaver98_GameIcon.png")));
    }//GEN-LAST:event_jButton5ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logo1Button;
    private javax.swing.JButton logo2Button;
    private javax.swing.JButton logo3Button;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
