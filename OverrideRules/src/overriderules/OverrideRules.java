// Some rules for method overiding
//1).number of arguments must be same and argument may be diffrent but parameter must be same
//2).Siganture must be same in method overriding
//3)Return type also must be same
//4).final and static method cannot be overrided
// 5).Private method cannot be used in sub class
package overriderules;

class Super{
    void display(){
        System.out.println("Super display:");
    }
}
class Sub extends Super{
    void display(){
        System.out.println("Sub display:");
    }
}
public class OverrideRules {

    public static void main(String[] args) {
        Super s=new Sub();
        s.display();
    }
    
}
