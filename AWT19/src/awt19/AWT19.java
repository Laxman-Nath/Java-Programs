// Window event in awt
package awt19;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements WindowListener{
    Label l;
    public MyFrame (){
        super("Window event demo");
        l=new Label("No message from window");
        setLayout(new FlowLayout());
        add(l);
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
      l.setText("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
      l.setText("Window closing");
      System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
      l.setText("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
      l.setText("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    l.setText("Window DeIconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
     l.setText("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
      l.setText("Window Deactivated");
    }
}

public class AWT19 {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
