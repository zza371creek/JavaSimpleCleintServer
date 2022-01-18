import java.io.*; 
import java.net.*;
import java.lang.*;

/**
 *
 * @author zza
 */
public class TCPServer   {
    
   public TCPServer() {
       run();
        
    }

    
    
    public void run() 
    { 
         System.out.println("Server started"); 
        try
        {
        String clientSentence; 
        String capitalizedSentence; 
        ServerSocket welcomeSocket = new ServerSocket(6789); 
       
       
        while(true) 
        { 
             System.out.println("Waiting for connection");
             Socket connectionSocket = welcomeSocket.accept(); 
             System.out.println("Got connection");
           BufferedReader inFromClient = 
              new BufferedReader(new
              InputStreamReader(connectionSocket.getInputStream())); 
              
            DataOutputStream  outToClient = 
             new DataOutputStream(connectionSocket.getOutputStream()); 
             
               //clientSentence = "hello client"; 
              clientSentence = inFromClient.readLine(); 
            capitalizedSentence = clientSentence.toUpperCase() + '\n'; 

            outToClient.writeBytes(capitalizedSentence); 
            }
        
        }
        catch(Exception e)
        {
        }
        
        
        }
    } 