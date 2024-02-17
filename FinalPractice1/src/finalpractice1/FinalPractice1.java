// Illustrating final variables in java
package finalpractice1;
class MY{
    final int MIN=-1;
    static final int NORMAL;
    final int MAX;
    static{
        NORMAL=10;
    }
    MY(){
        MAX=20;
    }
}
public class FinalPractice1 {


    public static void main(String[] args) {
       MY M=new MY();
       System.out.println(M.MIN);
       System.out.println(M.NORMAL);
       System.out.println(M.MAX);
    }
    
}
