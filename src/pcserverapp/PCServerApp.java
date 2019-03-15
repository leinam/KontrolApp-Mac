/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcserverapp;

/**
 *
 * @author leina
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
//import java.util.Scanner;
 

public class PCServerApp {
    
    static int statusCode;
    static int vol;
    public static void CreateSocket(){
       //establish server socket
        try{
            ServerSocket sSocket = new ServerSocket(6787);
            
            System.out.println("Your IP address is: " + checkIP() + " please enter this address in your phone app ");
            
            SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new SwingFrame(checkIP().toString());
           }
       });
            
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Press \n 1 for next slide \n 0 to mute sound \n 3 to play or pause music ");
            System.out.println("---------------------------------------------------------------------------");

            while(true){
            Socket myPCSocket = sSocket.accept();
            
            InputStream is = myPCSocket.getInputStream();
            InputStreamReader isR= new InputStreamReader(is);
            
           
            //BufferedInputStream bis = new BufferedInputStream(is);
            BufferedReader br = new BufferedReader(isR);
            
            //receive message and display
            String clientMessage = br.readLine();
            try{
            vol = Integer.parseInt(clientMessage);}
            
            catch(NumberFormatException e){
                e.printStackTrace();
            }
            
            // vol=br.read();
            
            System.out.println(clientMessage);
            //System.out.println(vol);
            
            //check if connection has been established with client
            if (vol==2){
                System.out.println("Connection established with phone.");
                statusCode=vol;
                checkConnection(statusCode);
            }
            
            //determine appropriate response
            FetchResponse(vol);
             
            
            //Output a message to client
            OutputStream os = myPCSocket.getOutputStream();
            BufferedOutputStream bos = new BufferedOutputStream(os);
            DataOutputStream dosToClient = new DataOutputStream(bos);
            
            /*
            String testToClient = clientMessage.toUpperCase();
            dosToClient.writeBytes(testToClient);}*/
           
            //after send attempt update statusCode and check status
            checkConnection(statusCode);
            System.out.println(checkConnection(statusCode));
        }
        }
        
        catch(SocketException exception){
            exception.printStackTrace();
        }
        catch(IOException ioE){    
            ioE.printStackTrace();
        }
        catch(SecurityException se){
        se.printStackTrace();
        } 
       
    //return vol;
    }
    public static void main(String[] args)  {
        //TODO code application logic here
        
       CreateSocket();
            
    }
    
    public static void FetchResponse(int code){
    switch (code){
        //sound control -- enter loop to change the vol with exit condition??
        case 0:
        {
            MuteSound.setMasterVolume(0);
        }break;
        
        /*case 2:
          {
                System.out.println("Connection established with phone.");
            }*/
          
        //Media control
        case 3:
        {
            MediaControl.playPause();
        }break;
        
        case 4:
        {
        MediaControl.playNext();
        }break;
        
        case 5:
        {
        MediaControl.playPrevoius();
        }break;
        
        //Slide control
        case 6:{
            ArrowKeys.arrowLeft();
        }break;
        
        case 7:{
            ArrowKeys.arrowRight();
        }break;
        
        case 8:{
            ArrowKeys.Fullscreen();
        }break;
        
        default:{
            //System.out.println("Please try again");
        }
    }
    
    
    }
    
    public static InetAddress checkIP(){
    InetAddress IP = null;
        try {
            IP = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            Logger.getLogger(PCServerApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    return IP;
    }
    
    public static boolean checkConnection(int statusCode){
        boolean status = false;
        if (statusCode==2){
        status=true;
        }
        return status;
    }
    
   
}
