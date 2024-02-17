// Textarea in swing
package swing3;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
class MyFrame extends JFrame{
    public MyFrame(){
        JTextArea jta=new JTextArea(10, 10);
        setLayout(new FlowLayout());
       Border  bd=BorderFactory.createLineBorder(Color.yellow);
       
        jta.setText("Laxman nath");
        jta.setBorder(bd);
        add(jta);
    }
}
public class Swing3 {


    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
