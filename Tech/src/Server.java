import java.rmi.*;
import java.rmi.registry.*;

public class Server 
{
    
    public static void main(String args[]) throws Exception {
            
    try
    {
        // CREATES AN OBJECT INTERFACE IMPLEMENTATION CLASS
        AddC obj = new AddC();
        
        // BINDS THE REMOTE OBJECT BY THE NAME ADD
        Naming.rebind("ADD",obj);
        
        // PRINT OUT IF SUCCESFUL
        System.out.println("Server is ready my nigga");
    }
    catch (Exception e)
    {
       System.out.println(e);    
    }
}
}