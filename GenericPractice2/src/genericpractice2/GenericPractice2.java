// Generic in java
package genericpractice2;

public class GenericPractice2 {


    public static void main(String[] args) {
        Object obj[]=new Object[3];
        obj[0]="hello";
        obj[1]="hi";
        obj[2]=new Integer(20);
        for(int i=0;i<3;i++){
            String x=(String)obj[i];
            System.out.println(x);
        }
    }
    
}
