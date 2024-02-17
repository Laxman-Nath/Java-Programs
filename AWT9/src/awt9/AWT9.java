//   List and choice component in awt and it's related event
package awt9;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame{
    List l;
    Choice c;
    TextArea ta;
    public MyFrame(){
        l=new List(4,true);
        c=new Choice();
        ta=new TextArea(10,20);
        l.add("sunday");
        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        
        c.add("January");
        c.add("Febraury");
        c.add("March");
        c.add("April");
        c.add("May");
        
        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);
        Handler h=new Handler();
        l.addItemListener(h);
        l.addActionListener(h);
        c.addItemListener(h);
    }
    
    class Handler implements ItemListener,ActionListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
         if(e.getSource()==l){
            ta.setText(l.getSelectedItem());
        }
        if(e.getSource()==c){
            ta.setText(c.getSelectedItem());
        }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
          String list[]=l.getSelectedItems();
          String txt="";
          for(String x:list)
              txt+=x+"\n";
          
          ta.setText(txt);
        }

}
}

public class AWT9 {

    
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
