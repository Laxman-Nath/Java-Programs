// Write a java program to add numbers using Commmand line arguments
package commandlineargumentspractice1;


public class CommandLineArgumentsPractice1 {

   
    public static void main(String[] args) {
        double s=0;
        for(String x:args){
            if(x.matches("[0-9\\.]+"))
            s=s+Double.parseDouble(x);
        }
        System.out.println("The sum is:"+s);
            
    }
    
}
