// Card Layout in awt
package awt15;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener{
    Button b1,b2,b3;
    TextField t1,t2,t3;
    Checkbox c1,c2;
    Panel p1;
    Panel p2;
    Panel mp;
    Panel cp;
    CardLayout cl;
    public MyFrame() {
        super("CardLayout demo");
        b1=new Button("One");
        b2=new Button("Two");
        b3=new Button("Three");
        p1=new Panel();
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        
        t1=new TextField(10);
        t2=new TextField(10);
         t3=new TextField(10);
         p2=new Panel();
         p2.add(t1);
         p2.add(t2);
         p2.add(t3);
        
         cl=new CardLayout();
         mp=new Panel();
         mp.setLayout(cl);
         mp.add(p1);
         mp.add(p2);
         
          CheckboxGroup cbg=new CheckboxGroup();
          cp=new Panel();
         c1=new Checkbox("One",true,cbg);
         c2=new Checkbox("Two",true,cbg);
          cp.add(c1);
         cp. add(c2);
         c1.addItemListener(this);
         c2.addItemListener(this);
         
         add(cp,BorderLayout.NORTH);
         add(mp,BorderLayout.CENTER);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.getState()){
            cl.first(mp);
        }
        else{
            cl.last(mp);
        }
    }
}

public class AWT15 { 

  
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
