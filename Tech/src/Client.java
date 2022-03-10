import java.rmi.*;
import java.util.*;


public class Client {
    
public static void main(String[] args)throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    while(true) {
        
        // USER MENU CODE
       
         System.out.println("\n\nSelect a file number:");
         
        System.out.println("File 1 = Feme \nFile 2 = Vivian \nFile 3 = Alvin \nFile 4 = Joshua");
              
        System.out.print("\nI pick file number: ");
        int opt = sc.nextInt();
        if (opt == 5) 
        {
            break;
        }
        
       
        // SWITCH CASE TO SELECT MULTIPLE OPTIONS
        switch(opt) {
            case 1:
                //LOOKUP METHOD TO FIND REFERENCE OF REMOTE
                AddI obj = (AddI)Naming.lookup("ADD");
                
                //IF STATEMENT FOR NUMBER IS 2
                if (opt == 1) {
                    
                   // LINK TO FEME WORDS
                   String x = obj.FemeReply();
                   
                   // PRINT OUT FEME WORDS
                   System.out.println(x);
                }
                else 
                {
                   break;
                }
                
                
                
           
            case 2:
                //LOOKUP METHOD TO FIND REFERENCE OF REMOTE
                AddII obj1 = (AddII)Naming.lookup("ADD");
                
                //IF STATEMENT FOR NUMBER IS 2
                 if (opt == 2) {
                     
                  // LINK TO VIVIAN WORDS
                  String x = obj1.VivianReply();
                  
                  // PRINT OUT VIVIAN WORDS
                  System.out.println(x);
                }
                else 
                {
                   break;
                }
                
                
             case 3:
                //LOOKUP METHOD TO FIND REFERENCE OF REMOTE
                AddIII obj2 = (AddIII)Naming.lookup("ADD");
                
                //IF STATEMENT FOR NUMBER IS 3
                if (opt == 3) {
                    
                   // LINK TO ALVIN WORDS
                   String x = obj2.AlvinReply(); 
                   
                   // PRINT OUT ALVIN WORDS
                   System.out.println(x);
                }
                else 
                {
                   break;
                }
                
            case 4:
                //LOOKUP METHOD TO FIND REFERENCE OF REMOTE
                AddIV obj3 = (AddIV)Naming.lookup("ADD");
                
                //IF STATEMENT FOR NUMBER IS 4
                if (opt == 4) {
                    
                   // LINK TO JOSHUA WORDS
                   String x = obj3.JoshuaReply();  
                   
                   // PRINT OUT JOSHUA WORDS
                   System.out.println(x);
                }
                else 
                {
                   break;
                }
        }
    }
    
}
}