// @Deprecated in-built practice in java
package annotationpractice2;
class oldClass{
        public void display(){
            System.out.println("Hi");
            }
        @Deprecated // ->Make less use of this method
    public void show(){
        System.out.println("Hello");
               }
    

}

public class AnnotationPractice2 {

    
    public static void main(String[] args) {
        oldClass ol=new oldClass();
        ol.show();
    }
    
}
