package pcserverapp;


import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class SwingFrame extends JFrame{
    private JTextArea textArea;
    private JButton btn;
    
    public SwingFrame(){
    super("KontrolApp Pairing");
        setSize(300,500);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        textArea = new JTextArea();
        btn = new JButton("Click Me!");

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);
        
    }
    
    
}
