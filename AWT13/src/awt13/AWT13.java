// GridLayout
package awt13;

import java.awt.*;

class MyFrame extends Frame{
    Button b1,b2,b3,b4,b5,b6;
    public MyFrame(){
        super("GridLayout demo");
        b1=new Button("One");
         b2=new Button("Two");
         b3=new Button("Three");
         b4=new Button("Four");
          b5=new Button("Five");
           b6=new Button("Six");
           
         
           setLayout(new GridLayout(3,3));
           add(b1);
           add(b2);
           add(b3);
           add(b4);
           add(b5);
           add(b6);
           add(new Button("Seven"));
         
         
    }
}
public class AWT13 {


    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
