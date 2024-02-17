// Checkbox in awt .The events related to checkbox is ItemEvent and interface is ItemListener
package awt5;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements  ItemListener{
    Label l;
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;
    public MyFrame(){
        super("Check box demo");
        l=new Label("Nothing is selected");
        c1=new Checkbox("Java");
        c2=new Checkbox("C#");
        c3=new Checkbox("Python");
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(c1);
        add(c2);
        add(c3);
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";
        if(c1.getState())
            str=str+c1.getLabel();
        if(c2.getState())
            str=str+c2.getLabel();
         if(c3.getState())
            str=str+c3.getLabel();
         if(str=="")
             str=str+"Nothing is selected";
         
         l.setText(str);
    }
            
}
public class AWT5 {


    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
