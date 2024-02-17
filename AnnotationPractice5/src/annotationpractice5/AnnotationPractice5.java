// user-defined annotations in java
package annotationpractice5;
import java.lang.annotation.Annotation;
@interface MyAnno{
    String name();// It is a element of annotaion.In all place where this annotation is used must contain this 
//    element
}
// Applying annotation to class
@MyAnno(name = "Laxman")
public class AnnotationPractice5 {
    // Applying annotation to global variable
    @MyAnno(name = "Laxman")
  int data;
    
  // Applying annotation to method
    @MyAnno(name = "Laxman")
    // Applying annotation to parameter of function
    public static void main(@MyAnno(name = "Laxman") String[] args) {
        // Applying annotation to local varaible
        @MyAnno(name = "Laxman")
        int x;
    }
    
}
