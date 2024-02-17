// JTextField and JFormattedtextField in swing
package swing2;
import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.text.NumberFormatter;
class MyFrame extends JFrame{

    public MyFrame() {
        JTextField jf1=new JTextField(15);
        
//        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
         DateFormat df=new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField jf2=new JFormattedTextField(df);
        jf2.setColumns(15);
//        jf2.setValue(0);
        jf2.setValue(new Date());
        
        NumberFormat nf=NumberFormat.getInstance();
        NumberFormatter nf1=new NumberFormatter(nf);
        nf1.setAllowsInvalid(false);
        nf1.setMaximum(1000);
        JFormattedTextField jf3=new JFormattedTextField(nf1);
        jf3.setColumns(15);
        
        NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nf3=new NumberFormatter(nf2);
        nf3.setAllowsInvalid(false);
        nf3.setMaximum(1000);
        JFormattedTextField jf4=new JFormattedTextField(nf3);
        jf4.setColumns(15);
        jf4.setValue(0);
        
        setLayout(new FlowLayout());
        add(jf1);
        add(jf2);
        add(jf3);
        add(jf4);
    }
    
    
}
public class Swing2 {


    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
