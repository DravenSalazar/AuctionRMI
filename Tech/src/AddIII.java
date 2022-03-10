import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AddIII extends Remote {
    
    // DECLARING METHOD PROTOTYPE AND THROWING EXCEPTION
    public String AlvinReply() throws Exception;
}