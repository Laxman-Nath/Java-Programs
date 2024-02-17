// Painting inside frame
package awt30;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    int x=0,y=0;
    public MyFrame(){
        super("Painting");
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me){
                x=me.getX();
                y=me.getY();
                repaint();
            }
        });
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Times New Roman",Font.BOLD,50));
        g.drawString("hello",x,y);
    }
}
public class AWT30 {

   
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
