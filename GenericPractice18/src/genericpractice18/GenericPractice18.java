// Do's and Don'ts of generics in java
//1.Only extends is allowed in Generic class of definition.
//2.extends is also used for interfaces also.
//3.extends from only one class and multiple interfaces(if A is class and B and C are interfaces then while defining
//generic class the order must be (class myArray<T extends A & B &C).
//4.extends and super are allowed with ? in methods(extends is allowed in class but super doesn't)
//5.<?> will accept all types but cannot access
//6. Base type of object should be same or ?

package genericpractice18;

public class GenericPractice18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
