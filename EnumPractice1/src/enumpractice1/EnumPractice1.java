// Enum in java
package enumpractice1;

enum Dept{
    CS, IT,CIVIL , ECE ;
}
public class EnumPractice1 {

    
    public static void main(String[] args) {
        Dept d1=Dept .CS;
        Dept d2=Dept .IT;
        Dept d3=Dept .CIVIL;
        Dept d4=Dept .ECE;
        
        System.out.println("The names of departments are:");
        System.out.println(d1.name());
        System.out.println(d2.name());
        System.out.println(d3.name());
        System.out.println(d4.name());
        
        System.out.println("The order of "+d1.name()+" "+d1.ordinal());
        System.out.println("The order of "+d2.name()+" "+d2.ordinal());
        System.out.println("The order of "+d3.name()+" "+d3.ordinal());
        System.out.println("The order of "+d4.name()+" "+d4.ordinal());
        
//        System.out.println(Dept.valueOf("IT"));
//        System.out.println(Dept.valueOf("CS"));
//        System.out.println(Dept.valueOf("CIVIL"));
//        System.out.println(Dept.valueOf("ECE"));
        
        Dept list[]=Dept.values();
        for(Dept d:list){
            System.out.println(d);
        }
        
        
    }
    
}
