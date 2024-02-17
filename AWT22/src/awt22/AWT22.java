/* Adapter Listener in awt.
   it is alternate to listeners.
   The listener classes have only limited methods.
   also sometimes we have to implement all the methods inside the listener interface
   although we only need some of them.
   Adapters are abstract classes but listeners are interfaces.So we have to extends the adpaters.
   Here we are using window adapter class.
*/
package awt22;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame{
    public MyFrame(){
        super("Adapter demo");
        addWindowListener(new Handler());
}
    class Handler extends WindowAdapter{
    @Override
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
}
public class AWT22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MyFrame f=new MyFrame();
      f.setSize(500,500);
      f.setVisible(true);
    }
    
}
