// Enum in java
package enumpractice4;
enum Dept
{
    CS("Bikash","Block A"),IT("Laxman","Block B"),CIVIL("Rohit","Block C"),ECE("Ramesh",
    "Block D");
    String head;
    String location;
    private Dept(String head,String location){
        this.head=head;
        this.location=location;
    }
    public String getHeadName(){
        return head;
    }
    public String getLocation(){
        return location;
    }
}
public class EnumPractice4 {


    public static void main(String[] args) {
        Dept d1=Dept.CS;
        Dept d2=Dept.IT;
        Dept d3=Dept.CIVIL;
        Dept d4=Dept.ECE;
        System.out.println(d1.getHeadName());
        System.out.println(d1.getLocation());
         System.out.println(d2.getHeadName());
        System.out.println(d2.getLocation());
         System.out.println(d3.getHeadName());
        System.out.println(d3.getLocation());
         System.out.println(d4.getHeadName());
        System.out.println(d4.getLocation());
    }
    
}
