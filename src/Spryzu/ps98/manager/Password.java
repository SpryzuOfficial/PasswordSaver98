package Spryzu.ps98.manager;

public class Password 
{
    private String name;
    private String url;
    private String username;
    private String password;
    private String icon;
    private String date;
    
    public Password(String name, String url, String username, String password, String icon, String date) 
    {
        this.name = name;
        this.url = url;
        this.username = username;
        this.password = password;
        this.icon = icon;
        this.date = date;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getUrl() 
    {
        return url;
    }

    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getIcon() 
    {
        return icon;
    }

    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}
