// Painting inside the frame
package awt28;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    int x=0,y=0;
    public MyFrame(){
        super("Painting demo");
        addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent me){
               x=me.getX();
               y=me.getY();
               repaint();
              
            }
        });
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
//        g.drawOval(x, y, 50, 50);
       g.fillOval(x,y,50,50);
    }
}
public class AWT28 {

    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
    }
    
}
