// Introduction to swing
package swing1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class MyFrame extends JFrame implements ActionListener{
    JLabel l;
    JButton b;
    int count=0;
    public MyFrame(){
        super("Swing demo");
        l=new JLabel("Clicked "+count+" times");
        b=new JButton("click");
        setLayout(new FlowLayout());
        add(l);
        add(b);
        getRootPane().setDefaultButton(b);
//        add(new JButton("Cancel"));
        b.addActionListener(this);
        l.setToolTipText("counter");
        
    }
    public void actionPerformed(ActionEvent ae){
        count++;
        l.setText("Clicked "+count+" times");
    }
}
public class Swing1 {

    
    public static void main(String[] args) {
      MyFrame f=new MyFrame();
      f.setSize(500,500);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
