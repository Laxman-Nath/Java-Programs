// Generic methods
package genericpractice14;


public class GenericPractice14 {
    
static <E> void show(E... list){
    for(E x:list){
        System.out.println(x);
    }
}
    public static void main(String[] args) {
        show("Hi","Hello","Laxman");
        show(1,2,4,5,7);
    }
    
}
