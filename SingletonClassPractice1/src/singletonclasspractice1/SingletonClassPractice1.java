// A singleton class's only one object can be created
package singletonclasspractice1;
class CoffeeMachine{
    private float coffeeQty;
    private float waterQty;
    private float sugarQty;
    private float milkQty;
    private static CoffeeMachine m=null;
    private CoffeeMachine(){
        coffeeQty=1;
        waterQty=1;
        sugarQty=1;
        milkQty=1;
    }
    public static CoffeeMachine getInstance(){
        if(m==null){
            m=new CoffeeMachine();
        }
        return m;
    }
    public void fillWater(float qty){
        waterQty=qty;
    }
    public void fillSugar(float qty){
        sugarQty=qty;
    }
    
    public float getCoffee(){
        return 0.23f;
    }
    public void display(){
        System.out.println("Coffee quantity is:"+coffeeQty);
        System.out.println("Water quantity is:"+waterQty);
    }
}
    

public class SingletonClassPractice1 {

    public static void main(String[] args) {
       CoffeeMachine m1=CoffeeMachine.getInstance();
       CoffeeMachine m2=CoffeeMachine.getInstance();
       CoffeeMachine m3=CoffeeMachine.getInstance();
       System.out.println(m1+" "+m2+" "+m3);
       if(m1==m2 && m2==m3)
           System.out.println("Same:");
       
    }
    
}
