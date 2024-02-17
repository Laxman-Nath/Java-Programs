// Bounded generic methods in java
package genericpractice15;

public class GenericPractice15 {
    static <E extends Number> void show(E ... list){
        for(E x:list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
//        show("Lama","Hello","World");  it is not allowed because its not the child class of Number class
        show(1,2,4,5);
        show(1.2f,1.3f);
    }
    
}
