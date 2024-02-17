
package awt18;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements MouseMotionListener{
    Label l1,l2;

    public MyFrame()  {
        super("Mouse event demo");
        l1=new Label("");
        l2=new Label("");
        setLayout(null);
        l1.setBounds(30,50,100,20);
        l2.setBounds(30,90,100,20);
        add(l1);
        add(l2);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
         l1.setText("Mouse dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      l1.setText("Mouse moved");
      l2.setText(e.getX()+","+e.getY());
    }

   
    
}
public class AWT18 {

    public static void main(String[] args) {
         MyFrame f=new MyFrame();
         f.setSize(500,500);
         f.setVisible(true);
    }
    
}
