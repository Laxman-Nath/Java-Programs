// Creating radiobox using checkbox group and handling i
package awt6;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1;
    Checkbox c2;
    Checkbox c3;
     CheckboxGroup cbg;
     public MyFrame(){
         super("Radio box demo");
         l=new Label("Nothing is selected");
         cbg=new CheckboxGroup();
         c1=new Checkbox("Java",true,cbg);
         c2=new Checkbox("C#",true,cbg);
         c3=new Checkbox("Python",true,cbg);
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
          str=c1.getLabel()+str;
      if(c2.getState())
          str=c2.getLabel()+str;
      if(c3.getState())
          str=c3.getLabel()+str;
      if(str=="")
          str=str+"Nothing is selected";
      
      l.setText(str);
    }
}
public class AWT6 {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
