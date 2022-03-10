import java.rmi.*;
import java.rmi.server.*;

public class AddC extends UnicastRemoteObject implements AddI, AddII, AddIII, AddIV {
    
    
    // DEFAULT CONSTRUCTOR TO THROW REMOTEEXCEPTION FROM ITS PARENT CONSTRUCTOR
    public AddC() throws Exception 
    {
        super();
    }
    
    // IMPLEMENTATION OF THE FEME, VIVIAN, ALVIN AND JOSHUA INTERFACES
    public String FemeReply() {return "Hi I'm Feme";}
    
    public String VivianReply() {return "Hi I'm Vivian";}
    
   public String AlvinReply() {return "Hi I'm Alvin";}
   
    public String JoshuaReply() {return "Hi I'm Joshua";}

    
   
}