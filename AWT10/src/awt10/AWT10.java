// Scrollbar component in java and event related to it
package awt10;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements AdjustmentListener{
    Scrollbar red,green,blue;
    TextField tf;
    public MyFrame(){
        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf=new TextField();
        tf.setBounds(50,50,300,50);
        red.setBounds(50, 150, 300, 30);
        green.setBounds(50, 200, 300, 30);
        blue.setBounds(50, 250, 300, 30);
        setLayout(null);
        add(tf);
        add(red);
        add(green);
        add(blue);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
         blue.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
         tf.setBackground(new Color(red .getValue(),green .getValue(),blue.getValue()));
    }
    
}
public class AWT10 {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
