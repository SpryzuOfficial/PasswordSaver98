package Spryzu.ps98.manager;

import Spryzu.ps98.Exceptions.OSNotSupportedException;

public class OSPathsClass 
{
    public static String USER_APPDATA; 
    public static String MASTER_PASSWORD_PATH;
    public static String MASTER_PASSWORD_FOLDER_PATH;
    public static String PASSWORDS_PATH;
    public static String PASSWORDS_FOLDER_PATH;
    public static String LOCK_FILE_PATH;
    public static String CONFIG_FILE_PATH;
    
    public OSPathsClass() throws OSNotSupportedException
    {
        if(System.getProperty("os.name").toLowerCase().contains("win"))
        {
            USER_APPDATA = System.getenv("LOCALAPPDATA");
            MASTER_PASSWORD_PATH = USER_APPDATA + "\\PasswordSaver98Data\\masterPasword.ps98C";
            MASTER_PASSWORD_FOLDER_PATH = USER_APPDATA + "\\PasswordSaver98Data";
            PASSWORDS_PATH = USER_APPDATA + "\\PasswordSaver98Data\\Passwords\\";
            PASSWORDS_FOLDER_PATH = USER_APPDATA + "\\PasswordSaver98Data\\Passwords";
            LOCK_FILE_PATH = USER_APPDATA + "\\PasswordSaver98Data\\blockFile.ps98C";
            CONFIG_FILE_PATH = USER_APPDATA + "\\PasswordSaver98Data\\configFile.ps98C";
        }
        else if(System.getProperty("os.name").toLowerCase().contains("mac"))
        {
            USER_APPDATA = System.getProperty("user.home");
            MASTER_PASSWORD_PATH = USER_APPDATA + "/Library/Application Support/PasswordSaver98Data/masterPasword.ps98C";
            MASTER_PASSWORD_FOLDER_PATH = USER_APPDATA + "/Library/Application Support/PasswordSaver98Data";
            PASSWORDS_PATH = USER_APPDATA + "/Library/Application Support/PasswordSaver98Data/Passwords/";
            PASSWORDS_FOLDER_PATH = USER_APPDATA + "/Library/Application Support/PasswordSaver98Data/Passwords";
            LOCK_FILE_PATH = USER_APPDATA + "/Library/Application Support/PasswordSaver98Data/blockFile.ps98C";
            CONFIG_FILE_PATH = USER_APPDATA + "/Library/Application Support/PasswordSaver98Data/configFile.ps98C";
        }
        else
        {
            throw new OSNotSupportedException();
        }
    }
}
