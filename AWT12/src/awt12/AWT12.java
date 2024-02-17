// Border layout.It is the default layout in java
package awt12;
import java.awt.*;
class MyFrame extends Frame{
        Button b1,b2,b3,b4;
        public MyFrame(){
            b1=new Button("One");
            b2=new Button("Two");
            b3=new Button("Three");
            b4=new Button("Four");
            add(b1,BorderLayout.WEST);
            add(b2,BorderLayout.NORTH);
            add(b3,BorderLayout.SOUTH);
            add(b4,BorderLayout.CENTER);
            Panel p=new Panel();
            p.add(new Button("Mon"));
            p.add(new Button("Tue"));
            p.add(new Button("Thurs"));
            p.setLayout(new GridLayout(3, 1));
            add(p,BorderLayout.EAST);
        }
       
}
public class AWT12 {

    
    public static void main(String[] args) {
      MyFrame f=new MyFrame();
      f.setSize(500,500);
      f.setVisible(true);
    }
    
}
