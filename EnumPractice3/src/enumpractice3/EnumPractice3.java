// Enum in java
package enumpractice3;
enum Dept{
    CS , IT , CIVIL, ECE ;
    // Constructors inside enum can be private and default only
    
    private Dept(){
        System.out.println(this.name());
    }
    public void display(){
        System.out.println(this.name()+" "+this.ordinal());
    }
}
public class EnumPractice3 {


    public static void main(String[] args) {
        Dept d=Dept .ECE;
        d.display();
    }
    
}
