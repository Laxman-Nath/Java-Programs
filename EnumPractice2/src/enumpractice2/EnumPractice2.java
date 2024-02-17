// Enum in java
package enumpractice2;


enum Dept{
    CS,IT ,CIVIL ,ECE;
}
public class EnumPractice2 {


    public static void main(String[] args) {
        Dept d=Dept.CS;
        switch(d){
            case CS:
                System.out.println("Head:Laxman \n Block:A");
                break;
            case CIVIL:
                System.out.println("Head:Bikash \n Block:B");
                break;
            case IT:
                System.out.println("Head:Rohit \n Block:C");
                break;
            case ECE:
                System.out.println("Head:Ramesh \n Block:D");
                break;
        }
    }
    
}
