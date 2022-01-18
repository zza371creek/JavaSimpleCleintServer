import java.io.*; 
import java.net.*;
import java.lang.*;

public class client
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class client
     */
    public client()
    {
        // run the client
        run();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void run()
    {
         // the next part is the client code to talk to the server.. 
        // run the client.. 
        try {
         String sentence; 
        String modifiedSentence; 

        BufferedReader inFromUser = 
          new BufferedReader(new InputStreamReader(System.in)); 
 
        Socket clientSocket = new Socket("localhost", 6789); 

        DataOutputStream outToServer = 
          new DataOutputStream(clientSocket.getOutputStream()); 
    BufferedReader inFromServer = 
    new BufferedReader(new
          InputStreamReader(clientSocket.getInputStream())); 

        //sentence = inFromUser.readLine(); 
        sentence = "hello server";
        outToServer.writeBytes(sentence + '\n'); 

        modifiedSentence = inFromServer.readLine(); 

        System.out.println("FROM SERVER: " + modifiedSentence); 

        clientSocket.close();
        }
        catch(Exception e)
        {
        }
        
        
    }
}
