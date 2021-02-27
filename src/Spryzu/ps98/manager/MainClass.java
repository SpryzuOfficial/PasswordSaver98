package Spryzu.ps98.manager;

import Spryzu.ps98.Exceptions.OSNotSupportedException;
import Spryzu.ps98.frames.ConfigMasterPasswordFrame;
import Spryzu.ps98.frames.LogInFrame;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class MainClass 
{   
    public static void main(String[] args) 
    {
        try 
        {   
            startLookAndFeel();
            
            OSPathsClass paths = new OSPathsClass();
            
            if(readLockFile())
            {
                if(!new File(paths.MASTER_PASSWORD_PATH).exists())
                {
                    ConfigMasterPasswordFrame configMasterPassword = new ConfigMasterPasswordFrame(PasswordManager.MASTER_PASSWORD_MODE_CREATE_MASTER_PASSWORD);
                    configMasterPassword.setVisible(true);
                    configMasterPassword.setLocationRelativeTo(null);
                }
                else
                {
                    if(!new File(paths.CONFIG_FILE_PATH).exists())
                    {
                        FileWriter configFile = new FileWriter(paths.CONFIG_FILE_PATH);
                        configFile.write("1¡1¡1¡3¡0¡2");
                        configFile.close();
                    }
                    
                    LogInFrame loginFrame = new LogInFrame(PasswordManager.LOGIN_MODE_START_APP, null);
                    loginFrame.setVisible(true);
                    loginFrame.setLocationRelativeTo(null);
                }
            }
            else
            {
                if(readLockFileConfig() == 0)
                {
                    new MainClass().sendAlert("Password Saver 98 is locked" + 
                                              "\n" + "please wait to reopen Password Saver 98");
                }
                else if(readLockFileConfig() == 1)
                {
                    new MainClass().sendAlert("Password Saver 98 is permanently locked");
                }
            }
        } 
        catch (OSNotSupportedException ex) 
        {
            new MainClass().sendAlert(ex.toString());
        }
        catch (Exception ex)
        { 
            new MainClass().sendAlert(ex.toString());
        }
    }
    
    private static int readLockFileConfig() throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        
        String fileContent;
        String[] fileElements;
        
        BufferedReader bReader = new BufferedReader(new FileReader(paths.LOCK_FILE_PATH));
        fileContent = bReader.readLine();
        
        fileElements = fileContent.split("¡");
        
        return Integer.parseInt(fileElements[0]);
    }
    
    private static boolean readLockFile() throws Exception
    {
        OSPathsClass paths = new OSPathsClass();
        if(!new File(paths.LOCK_FILE_PATH).exists()) return true;
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        
        String fileContent;
        String[] fileElements;
        
        BufferedReader bReader = new BufferedReader(new FileReader(paths.LOCK_FILE_PATH));
        fileContent = bReader.readLine();
        
        fileElements = fileContent.split("¡");
        
        if(fileElements[0].equals("0"))
        {
            Date endLockDate = sdf.parse(fileElements[1]);
            Date currentDate = sdf.parse(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").format(LocalDateTime.now()));

            if(currentDate.compareTo(endLockDate) >= 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
    private static void startLookAndFeel()
    {
        try 
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
        } 
        catch (Exception ex) 
        {
            System.err.println("Error, " + ex);
        }
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
}
