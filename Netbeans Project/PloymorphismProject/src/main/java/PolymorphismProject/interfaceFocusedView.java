package PolymorphismProject;
import java.util.Date;

interface Encrypt
{
    void encrypt();
    void decrypt();
}

interface Compress
{
    void compress();
    void decompress();
}

interface Authenticate
{
    void login();
    void logout();
}

class FocusedView implements Encrypt, Compress, Authenticate
{
    @Override
    public void encrypt()
    {
        System.out.println("Encryption");
    }
    
    @Override
    public void decrypt()
    {
        System.out.println("Decryption");
    }
    
    @Override
    public void compress()
    {
        System.out.println("Compressed");
    }
    
    @Override
    public void decompress()
    {
        System.out.println("Decompressed");
    }
    
    @Override
    public void login()
    {
        System.out.println("Login");
    }
    
    @Override
    public void logout()
    {
        System.out.println("Logout");
    }
    
}
public class interfaceFocusedView {
    
    public static void main(String[] args)
    {
        FocusedView f = new FocusedView();
        
        System.out.println("\n_______ENCRYPTION________");
        Encrypt e = f;
        e.encrypt();
        e.decrypt();
        
        System.out.println("\n_______COMPRESS________");
        Compress c = f;
        c.compress();
        c.decompress();
        
        System.out.println("\n_______AUTHENTICATION________");
        Authenticate a = f;
        a.login();
        a.logout();
        
        System.out.println("______DATE______");
        Date date = new Date();
        System.out.println(date);
        
        
    }
    
}
