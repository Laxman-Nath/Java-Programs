// TextField component and event related to TextField is TextEvent
package awt7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.AbstractButton;
class MyFrame extends Frame{
    Label l1;
    Label l2;
    TextField tf;
    public MyFrame(){
        super("TextField demo");
        l1=new Label("No text is entered yet");
        l2=new Label("Enter key is not yet hit");
        tf=new TextField(20);
        tf.setEchoChar('*');
        handler h=new handler();
        tf.addTextListener(h);
        tf.addActionListener(h);
        setLayout(new FlowLayout());
        add(l1);
         add(tf);
        add(l2);

    }
class handler implements TextListener,ActionListener{
    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }
}
}
public class AWT7 {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
