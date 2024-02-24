// Splitpane in swing java
package swing9;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame extends JFrame implements ListSelectionListener {
    JList list;
    JLabel jl;
    JTabbedPane jtp;
    public MyFrame()  {
        super("Split demo");
        String cols[]={"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
        list =new JList(cols);
//        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1=new JScrollPane(list);
        
        jl=new JLabel(" ");
        jl.setOpaque(true);
        jl.setBackground(Color.red);
        JScrollPane p2=new JScrollPane(jl);
        
         jtp=new JTabbedPane();
         jtp.addTab("Colors", p1);
         jtp.add("Label",p2);
         add(jtp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
      String str=(String)list.getSelectedValue();
      switch(str){
          case "RED"->jl.setBackground(Color.red);
          case "GREEN"->jl.setBackground(Color.green);
          case "BLUE"->jl.setBackground(Color.blue);
          case "YELLOW"->jl.setBackground(Color.yellow);
          case "MAGENTA"->jl.setBackground(Color.magenta);
          case "ORANGE"->jl.setBackground(Color.orange);
         case "BLACK"->jl.setBackground(Color.black);
          
      }
    }
    
}

public class Swing9 {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
