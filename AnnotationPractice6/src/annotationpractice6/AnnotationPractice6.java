// User-defined annotations in java
package annotationpractice6;
@interface MyAnno
{
    //Element cannot throws exception
    // Element cannot have parameter
    // element can have return type
    // can have default value
    String name();
    String project();
    String date();
    String version() default "13";
}
@MyAnno(name = "laxman",project = "bank",date = "2023-04-02")
public class AnnotationPractice6 {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
