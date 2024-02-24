// Borders in java
/*
Here we are adding label,textfield and button jpanel and adding jpanel to the frame.
Then we are inserting border around panel.
*/
package swing5;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

class MyFrame extends JFrame{
    JLabel jl;
    JTextField jtf;
    JButton jb;
    JPanel jp;
    public MyFrame(){
        jl=new JLabel("Name:");
        jtf=new JTextField(20);
        jb=new JButton("ok");
        jp=new JPanel();
        setLayout(new FlowLayout());
        
//        Border br1= BorderFactory.createLoweredBevelBorder();
//        jp.setBorder(br1);

//        Border br2= BorderFactory.createRaisedBevelBorder();
//        jp.setBorder(br2);
         
//         Border br3= BorderFactory.createBevelBorder(BevelBorder.LOWERED);
//         Border br3= BorderFactory.createBevelBorder(BevelBorder.RAISED);
//        jp.setBorder(br3);

//  Border br4= BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
//     Border br4= BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
//     jp.setBorder(br4);
       
//       Border br5=BorderFactory.createLineBorder(Color.yellow, 10);
//   Border br5=BorderFactory.createLineBorder(Color.red, 5,true);
//     jp.setBorder(br5);

//Border br6=BorderFactory.createTitledBorder("Login");
//Border br6=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED,3),"login");
Border br6=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(
        Color.BLACK),"Login",TitledBorder.ABOVE_TOP,TitledBorder.LEFT);
     jp.setBorder(br6);

     
       jp.add(jl);
        jp.add(jtf);
        jp.add(jb);
        add(jp);
    }
}
public class Swing5 {

    public static void main(String[] args) {
     MyFrame f=new MyFrame();
     f.setSize(500,500);
     f.setVisible(true);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
