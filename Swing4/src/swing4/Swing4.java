// CheckBox and RadioBox demo in java swing
package swing4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
class MyFrame extends JFrame implements ActionListener{
    JTextField jtf;
    JCheckBox c1,c2;
    JRadioButton r1,r2;
    public MyFrame(){
        super("Checkbox");
       jtf=new JTextField("Demo Text", 20);
//       jtf.setBounds(10, 100, 40, 50);
       
        c1=new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);
        c2 =new JCheckBox("Italic");
        c2.setMnemonic(KeyEvent.VK_I);
        c1.addActionListener(this);
        c2.addActionListener(this);
        
        r1=new JRadioButton("Lower");
        r2=new JRadioButton("Upper");
        r1.addActionListener(this);
        r2.addActionListener(this);
       
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        setLayout(new FlowLayout());
        add(jtf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e .getActionCommand()) {
            case "Lower"->jtf.setText(jtf.getText().toLowerCase());
            case "Upper"->jtf.setText(jtf.getText().toUpperCase());
        }
        int b=0;
        int i=0;
        if(c1.isSelected()){
            b=Font.BOLD;
        }
        if(c2.isSelected()){
            i=Font.ITALIC;
        }
        Font f=new Font("Times new roman", b | i, 20);
        jtf.setFont(f);
    }
}
public class Swing4 {

    
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
