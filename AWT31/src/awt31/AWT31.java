// Creating animation using awt
package awt31;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements Runnable{
    int x,y,tx,ty;
    public MyFrame(){
        x=100;
        y=100;
        tx=1;
        ty=1;
        Thread t=new Thread(this);
        t.start();
        
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void run() {
      while(true){
          x+=tx;
          y+=ty;
          if(x<0 || x>450)
          {
              tx=tx*-1;
          }
          if(y<0 || y>350)
          {
              ty=ty*-1;
          }
          repaint();
          try {
              Thread.sleep(5);
          } catch (Exception e) {
          }
 
      }
    }
}
public class AWT31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,400);
        f.setVisible(true);
    }
    
}
