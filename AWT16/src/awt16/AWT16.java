// KeyEvent in awt
package awt16;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
class MyFrame extends Frame implements KeyListener{
    Label l1,l2,l3,l4;
    public MyFrame(){
        super("Key event demo");
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
        setLayout(null);
        l1.setBounds(30,30,100,20);
        l2.setBounds(30,50,100,20);
        l3.setBounds(30,80,100,20);
        l4.setBounds(30,110,200,20);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
       l3.setText("Key typed");
       l2.setText("");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key pressed");
        l4.setText(new Date(e.getWhen())+"");
        l2.setText("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
      l2.setText("Key released");
      l1.setText("");
      l3.setText("");
      l4.setText("");
    }
}

public class AWT16 {

  
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
