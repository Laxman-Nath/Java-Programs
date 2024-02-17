// Textarea and event related to it
package awt8; 
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
TextArea ta;
TextField tf;
Label l;
Button b;
public MyFrame(){
    super("Text area demo");
    ta=new TextArea(10,20);
    tf=new TextField(20);
    l=new Label("Text is not entered yet");
    b=new Button("OK");
    
    setLayout(new FlowLayout());
    add(ta);
    add(tf);
    add(l);
    add(b);
    Handler H=new Handler();
    b.addActionListener(H);
}

class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           l.setText(ta.getText());
//              ta.insert(tf.getText(),ta.getCaretPosition());
        }
    }
}

public class AWT8 {


    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
 }
