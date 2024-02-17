// There are different types of approaches for handling event:
// 1.Frame class as Listener
// 2.Inner class
// 3.Anonymous class 
// 4. Lambda expression
// Here we are handling event using frame class as listener
package awt26;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
    Button b;
    Label l;
    TextField tf;
    int count=0;
    public MyFrame(){
        super("Handling event");
        b=new Button("ok");
        tf=new TextField("0");
        setLayout(new FlowLayout());
        add(b);
        add(tf);
        b.addActionListener((ActionEvent ae)-> {
          count++;
          tf.setText(count+" ");
    
        });
    }


}
public class AWT26 {

    
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
    
}
