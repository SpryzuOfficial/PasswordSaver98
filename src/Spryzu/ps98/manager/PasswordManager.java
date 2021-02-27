package Spryzu.ps98.manager;

import java.util.Random;

public class PasswordManager 
{
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%&*_+-"; 
    public static final int LOGIN_MODE_START_APP = 0;
    public static final int LOGIN_MODE_CHANGE_PASSWORD = 1;
    public static final int LOGIN_MODE_SHOW_PASSWORD = 2;
    public static final int LOGIN_MODE_COPY_PASSWORD = 3;
    public static final int LOGIN_MODE_CHANGE_MASTER_PASSWORD = 4;
    public static final int MASTER_PASSWORD_MODE_CREATE_MASTER_PASSWORD = 0;
    public static final int MASTER_PASSWORD_MODE_CHANGE_MASTER_PASSWORD = 1;
    private boolean useLower;
    private boolean useUpper;
    private boolean useDigits;
    private boolean useSymbols;
    
    public PasswordManager(boolean useLower, boolean useUpper, boolean useDigits, boolean useSymbols)
    {
        this.useLower = useLower;
        this.useUpper = useUpper;
        this.useDigits = useDigits;
        this.useSymbols = useSymbols;
    }

    public static String getLOWER()
    {
        return LOWER;
    }

    public static String getUPPER() 
    {
        return UPPER;
    }

    public static String getDIGITS()
    {
        return DIGITS;
    }

    public static String getSYMBOLS() 
    {
        return SYMBOLS;
    }

    public boolean isUseLower() 
    {
        return useLower;
    }

    public void setUseLower(boolean useLower) 
    {
        this.useLower = useLower;
    }

    public boolean isUseUpper() 
    {
        return useUpper;
    }

    public void setUseUpper(boolean useUpper) 
    {
        this.useUpper = useUpper;
    }

    public boolean isUseDigits() 
    {
        return useDigits;
    }

    public void setUseDigits(boolean useDigits) 
    {
        this.useDigits = useDigits;
    }

    public boolean isUseSymbols() 
    {
        return useSymbols;
    }

    public void setUseSymbols(boolean useSymbols) 
    {
        this.useSymbols = useSymbols;
    }
    
    public String generatePassword(int length)
    {
        // Argument Validation.
        if (length <= 0)
        {
            return "";
        }

        // Variables.
        String password = "";
        Random random = new Random();

        // Collect the categories to use.
        String categories = "";
        char[] chLower = null;
        char[] chUpper = null;
        char[] chDigits = null;
        char[] chSymbols = null;
        
        if (useLower) 
        {
            categories += LOWER;
            chLower = LOWER.toCharArray();
        }
        if (useUpper) 
        {
            categories += UPPER;
            chUpper = UPPER.toCharArray();
        }
        if (useDigits) 
        {
            categories += DIGITS;
            chDigits = DIGITS.toCharArray();
        }
        if (useSymbols) 
        {
            categories += SYMBOLS;
            chSymbols = SYMBOLS.toCharArray();
        }
        
        boolean isComplete = false;
        while(!isComplete)
        {
            password = "";
            
            // Build the password.
            for (int i = 0; i < length; i++) 
            {
                int position = random.nextInt(categories.length());
                password += (categories.charAt(position));
            }
            
            if(useLower) 
            {
                for(int i = 0; i < chLower.length; i++)
                {
                    if(password.contains(String.valueOf(chLower[i])))
                    {
                        isComplete = true;
                        break;
                    }
                    isComplete = false;
                }
                
                if(!isComplete)
                {
                    continue;
                }
            }
            
            if(useUpper) 
            {
                for(int i = 0; i < chUpper.length; i++)
                {
                    if(password.contains(String.valueOf(chUpper[i])))
                    {
                        isComplete = true;
                        break;
                    }
                    isComplete = false;
                }
                
                if(!isComplete)
                {
                    continue;
                }
            }
            
            if(useDigits) 
            {
                for(int i = 0; i < chDigits.length; i++)
                {
                    if(password.contains(String.valueOf(chDigits[i])))
                    {
                        isComplete = true;
                        break;
                    }
                    isComplete = false;
                }
                
                if(!isComplete)
                {
                    continue;
                }
            }
            
            if(useSymbols) 
            {
                for(int i = 0; i < chSymbols.length; i++)
                {
                    if(password.contains(String.valueOf(chSymbols[i])))
                    {
                        isComplete = true;
                        break;
                    }
                    isComplete = false;
                }
                
                if(!isComplete)
                {
                    continue;
                }
            }
        }
        
        return password;
    }
    
    public boolean getPasswordStrength(int length)
    {
        int points = 0;
        if(useLower)
        {
            points += 3;
        }
        
        if(useUpper)
        {
            points += 5;
        }
        
        if(useDigits)
        {
            points += 1;
        }
        
        if(useSymbols)
        {
            points += 2;
        }
        
        points += (length - points / 2);
        
        if(points >= 14)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String encriptPassword(String decriptedPassword)
    {
        Random random = new Random();
        String encriptedPassword = "";
        char[] decriptedPasswordChars = decriptedPassword.toCharArray();
        String coverString;
        String categories = "";
        categories += LOWER;
        categories += UPPER;
        categories += DIGITS;
        categories += SYMBOLS;
        
        for(int i = 0; i < (decriptedPassword.length() + 1); i++)
        {
            for(int j = 0; j < 4; j++)
            {
                coverString = "";

                int position = random.nextInt(categories.length());
                coverString += (categories.charAt(position));
                encriptedPassword += coverString;
            }

            try
            {
                encriptedPassword += decriptedPasswordChars[i];
            }
            catch(Exception ex)
            { }
        }
        
        return encriptedPassword;
    }
    
    public String decriptPassword(String encriptedPassword)
    {
        String decriptedPassword = "";
        char[] encriptedPasswordChars = encriptedPassword.toCharArray();
        
        for(int i = 0; i < encriptedPassword.length(); i++)
        {
            if("4".equals(String.valueOf(i).substring(String.valueOf(i).length() - 1)) || "9".equals(String.valueOf(i).substring(String.valueOf(i).length() - 1)))
            {
                decriptedPassword += encriptedPasswordChars[i];
            }
        }
        
        return decriptedPassword;
    }
}
