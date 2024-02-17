// This is the third method of creating gui
package awt;
import java.awt.*;
public class AWT extends Frame {
    Label l;
    TextField tf;
    Button b;
    public AWT(){
        super("Myframe");
        setLayout(new FlowLayout());
        l=new Label("Name");
        tf=new TextField(20);
        b=new Button("OK");
        add(l);
        add(tf);
        add(b);
    }
    
    public static void main(String[] args) {
     AWT aw=new AWT();
     aw.setSize(400,400);
     aw.setVisible(true);
    }
    
}
