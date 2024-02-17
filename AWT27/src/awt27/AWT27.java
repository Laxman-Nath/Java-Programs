/* Components of menu:
1.MenuBar
2.MenuItems
3.When we click menu item, the action is performed.
Here,we will create menu items and add them into the menubar.Also,we add menubar
into the menu.Also,we are adding menu inside the frame.
*/
package awt27;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame {
    Menu File,sub;
    MenuItem open,save,close,closeAll;
    CheckboxMenuItem auto;
    MenuBar mb;
    TextField tf;
    public MyFrame(){
        super("menu demo");
        
        open=new MenuItem("open");
        save=new MenuItem("save");
        close=new MenuItem("close");
        closeAll=new MenuItem("closeAll");
        auto=new CheckboxMenuItem("Autosave");
        
        File=new Menu("Menu");
        
         sub=new Menu("close");
         sub.add(close);
        sub.add(closeAll);
        
       File.add(open);
       File.add(save);
       File.add(sub);
       File.add(auto);
       
       mb=new MenuBar();
        mb.add(File);
       
        tf=new TextField("     ");
        open.addActionListener((ActionEvent ae)->{
            tf.setText("open");
    });
       save.addActionListener((ActionEvent ae)->{
            tf.setText("save");
    });
           close.addActionListener((ActionEvent ae)->{
            tf.setText("close");
    });
               closeAll.addActionListener((ActionEvent ae)->{
            tf.setText("closeAll");
    });
     
       auto.addItemListener((ItemEvent ie)->{
           if(auto.getState())
               tf.setText("Auto on");
           else
           tf.setText("Auto off");   
       });
      setLayout(new FlowLayout());
      add(tf);
       setMenuBar(mb);
       
    }
            
    
}

public class AWT27 {

    
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(500,500);
       f.setVisible(true);
      
    }
    
}
