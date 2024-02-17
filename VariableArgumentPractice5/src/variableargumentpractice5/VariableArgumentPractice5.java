// Write a java program to calculate discount using varargs
package variableargumentpractice5;


public class VariableArgumentPractice5 {

    static double discount(double ...price){
        double sum=0;
        for(int i=0;i<price.length;i++){
            sum=sum+price[i];
        }
        
        if(sum<500){
            return 10*sum/100;
        }
        else if(sum>=500 && sum<=1000)
        {
            return 15*sum/100;
        }
        else if(sum>1000){
            return 20*sum/100;
        }
    
         return 0;   
    }
    public static void main(String[] args) {
        System.out.println("The discount is:"+discount());
        System.out.println("The discount is:"+discount(300.0));
        System.out.println("The disocount is:"+discount(400.0,400.0));
        System.out.println("The discount is:"+discount(300,400,500));
    }
    
}
