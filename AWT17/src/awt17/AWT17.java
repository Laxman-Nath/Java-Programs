
package awt17;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseListener{
    Label l1;

    public MyFrame()  {
        super("Mouse event demo");
        l1=new Label("");
        setLayout(null);
        l1.setBounds(30,50,100,20);
        add(l1);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       l1.setText("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       l1.setText("Mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
      l1.setText("Mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
       l1.setText("Mouse exited");
    }
    
}
public class AWT17 {

    public static void main(String[] args) {
         MyFrame f=new MyFrame();
         f.setSize(500,500);
         f.setVisible(true);
    }
    
}
