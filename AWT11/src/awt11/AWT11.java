// Flow layout in awt
package awt11;
import java.awt.*;
class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    public MyFrame(){
        super("Flowlayout demo");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        b4=new Button("Four");
        b5=new Button("Five");
        b6=new Button("Six");
       FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
        setLayout(fl);
        fl.setHgap(50);
        add(b1);
         add(b2);
          add(b3);
           add(b4); 
           add(b5); 
           add(b6);
           
           
    }
}
public class AWT11 {


    public static void main(String[] args) {
      MyFrame f=new MyFrame();
      f.setSize(500,500);
      f.setVisible(true);
    }
    
}
