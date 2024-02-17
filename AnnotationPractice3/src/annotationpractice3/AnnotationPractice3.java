// @SuppressWarnings in-built annotation in java
package annotationpractice3;
class oldClass{
    public void display()
    {
        System.out.println("Hello");
    }
    @Deprecated
    public void show(){
        System.out.println("Hi");
    }
}

public class AnnotationPractice3 {

  @SuppressWarnings("deprecated")
    public static void main(String[] args) {
      oldClass c1=new oldClass();
      c1.show();
    }
    
}
