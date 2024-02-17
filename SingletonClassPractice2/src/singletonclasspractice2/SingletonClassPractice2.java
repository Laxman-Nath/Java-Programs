
package singletonclasspractice2;
class coffeeMachine{
    private int coffeeQty;
    private int milkQty;
    private int waterQty;
    private static coffeeMachine m=null;
    private static int count=1;
    private coffeeMachine(){
        coffeeQty=1;
        milkQty=1;
        waterQty=1;
    }
    public static coffeeMachine getInstance(){ 
        if(count<=5){
            m=new coffeeMachine();
            System.out.println("Object "+count+" created successfully:"+m);
            
             count++;
        }
        else{
            System.out.println("Sorry more than five objects cannot be created:");
            System.exit(0);
        }
         return m;
    }
}
           
            
public class SingletonClassPractice2 {

    
    public static void main(String[] args) {
       coffeeMachine m1=coffeeMachine.getInstance();
       coffeeMachine m2=coffeeMachine.getInstance();
       coffeeMachine m3=coffeeMachine.getInstance();
       coffeeMachine m4=coffeeMachine.getInstance();
       coffeeMachine m5=coffeeMachine.getInstance();
       coffeeMachine m6=coffeeMachine.getInstance();
     if(m1==m2 && m2==m3 && m3==m4 && m4==m5)
     {
         System.out.println("same");
     }
     else{
         System.out.println("Not same:");
     }
    }
    
}
