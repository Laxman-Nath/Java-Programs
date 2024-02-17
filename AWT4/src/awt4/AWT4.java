// Button component and handling event of button
package awt4;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener{
    int count=0;
    Button b;
    Label l;
    public MyFrame(){
        super("Button demo");
        l=new Label("  "+count);
        b=new Button("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("  "+count);
    }
}
public class AWT4 {

   
    public static void main(String[] args) {
      MyFrame f=new MyFrame();
      f.setSize(400,400);
      f.setVisible(true);
    }
    
}
