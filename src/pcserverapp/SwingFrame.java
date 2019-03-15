package pcserverapp;


import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class SwingFrame extends JFrame{
    private JTextArea textArea;
    private JButton btnCheckStatus;
    private JLabel jlIpAddress;
    private JPanel jp;
    
    public SwingFrame(String IP){
    super("KontrolApp Pairing");
        setSize(300,300);
        setResizable(true);  
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setVisible(true);
        
        
        /*addWindowListener(new WindowAdapter() {
            @Override
        public void windowClosing(WindowEvent evt) {
        setVisible(false);
     }
        });*/
        
    
        
        jlIpAddress = new JLabel(IP);
        btnCheckStatus = new JButton("Check PC pairing status");
        jp = new JPanel();
        
        
        jp.add(jlIpAddress);
        jp.add(btnCheckStatus);
        
        //add(ipAddress, BorderLayout.CENTER);
        //add(btnCheckStatus, BorderLayout.SOUTH);
        
        add(jp,BorderLayout.CENTER);
        
      

    }
    
    
}
