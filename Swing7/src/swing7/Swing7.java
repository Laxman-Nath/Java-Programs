// Internal Jframe in swing java
package swing7;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.*;

class MyInternalFrame extends JInternalFrame{
    JTextArea ja;
    JScrollPane jp;
    static int count=0;

    public MyInternalFrame() {
        super("document "+ ++count, true, true,true,true);
        ja=new JTextArea();
        jp=new JScrollPane(ja);
        add(jp);
        
        JMenuBar jb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem ji=new JMenuItem();
        
        file.add(ji);
        jb.add(file);
        setJMenuBar(jb);
        setSize(300,300);
        setLocation(50, 50);
        setVisible(true);
    }
    
}

class MyFrame extends JFrame implements ActionListener
 {
    JDesktopPane jp;

    public MyFrame()  {
        super("Internal frame demo");
        jp=new JDesktopPane();
        setContentPane(jp);
        
        JMenuBar jb=new JMenuBar();
        JMenu c=new JMenu("Document");
        JMenuItem m1=new JMenuItem("new");
        
        c.add(m1);
        jb.add(c);
        setJMenuBar(jb);
        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      MyInternalFrame f=new MyInternalFrame();
      jp.add(f);
    }
    
}
public class Swing7 {


    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(800,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
