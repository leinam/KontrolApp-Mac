/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcserverapp;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class MuteSound {
    
    public static void setMasterVolume(float value)
    {
        String command = "set volume " + value;
        try
        {
            ProcessBuilder pb = new ProcessBuilder("osascript","-e",command);
            pb.directory(new File("/usr/bin"));
            System.out.println(command);
            
            StringBuffer output = new StringBuffer();
            
            Process p = pb.start();
            p.waitFor();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));//process input stream

            String line;
            while ((line = reader.readLine())!= null)//output process to string bit by bit
            {
                output.append(line + "\n");
            }
            System.out.println(output);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
