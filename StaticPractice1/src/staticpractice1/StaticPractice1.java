// Static variables and static methods in java
package staticpractice1;
class hondacity{
    static double price=10.0;
    int a,b;
    static double onRoadPrice(String city){
        switch(city){
            case "Delhi":
                return price+price*0.1;
            case "Mumbai":
                return price+price*0.8;
        }
          return -1;
        }
    }
public class StaticPractice1 {

   
    public static void main(String[] args) {
        System.out.println(hondacity.price);
        hondacity h1=new hondacity();
        hondacity h2=new hondacity();
        h1.price=20;
        h2.price=20+2;
        System.out.println("The price of h1 is: "+h1.price);
        System.out.println("The price of h2 is: "+h2.price);
        System.out.println("The onroad price on delhi is: "+hondacity.onRoadPrice("Delhi"));
    }
    
}
