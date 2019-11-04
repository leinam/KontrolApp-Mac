
package pcserverapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author leina
 */

public class MediaControl {
    public static void playPause(){
    String command = "kp:play-pause";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
}
    
    public static void playPrevoius(){
    String command = "kp:play-previous";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
}
    
    public static void playNext(){
    String command = "kp:play-next";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
}
    
    public static void notificationBar(){
        String command = "kd:fn";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
        
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
        
        command = "kp:f3";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
        
         command = "ku:fn";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
        
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
        
}
    
    public static void launchpad(){
        String command = "kd:fn";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
        
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
        
        command = "kp:f4";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
        
         command = "ku:fn";
        try{
            ProcessBuilder pb = new ProcessBuilder("/usr/local/Cellar/cliclick/4.0.1/bin/cliclick",command);
            //pb.directory(new File(""));
            System.out.println(command);
            
            Process p = pb.start();
            p.waitFor();
            StringBuilder sb = new StringBuilder();
            
            BufferedReader reader =  new BufferedReader(new InputStreamReader(p.getInputStream()));
            
            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                sb.append(line + "\n");
            }
            System.out.println(sb);
        }
        
    
    catch(IOException ioE)
        {
        ioE.printStackTrace();
        }
        
    catch(InterruptedException iE)
        {
            iE.printStackTrace();
        }
        
}
}

