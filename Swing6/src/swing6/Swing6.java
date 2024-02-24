/*
Jtree component of swing.
it helps to represent the data in the form of tree.
*/
package swing6;

import java.awt.BorderLayout;
import java.io.File;
import java.util.StringTokenizer;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class MyFrame extends JFrame implements TreeSelectionListener{
    JTree tree;
    JLabel jl;
    public MyFrame(){
        super("Tree demo");
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("C://MyJava");
        File f=new File("C://MyJava");
        for(File x:f.listFiles()){
            if(x.isDirectory()){
                DefaultMutableTreeNode temp=new DefaultMutableTreeNode(x.getName());
//                File f1=new File(x.getName());
                for(File y:x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(y.getName()));
                }
                root.add(temp);
            }
            else{
            root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }
        tree=new JTree(root);
        jl=new JLabel("No files selected");
        JScrollPane jsp=new JScrollPane(tree);
        tree.addTreeSelectionListener(this);
        add(jsp,BorderLayout.CENTER);
        add(jl,BorderLayout.SOUTH);
        
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        String str=e.getPath().toString();
       int index1= str.lastIndexOf(',');
        int index2= str.lastIndexOf(']');
       String str2= str.substring(index1,index2);
       String str3=str2.replaceAll("[,]", " ");
        jl.setText(str3);
    }
}
public class Swing6 {

    public static void main(String[] args) {
      MyFrame f=new MyFrame();
      f.setSize(500,500);
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
