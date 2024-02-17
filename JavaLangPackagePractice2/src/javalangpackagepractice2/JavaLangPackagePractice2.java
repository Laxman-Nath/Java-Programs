
package javalangpackagepractice2;

class MyObject {
    public String toString(){
        return "My object";
    }
    public int hashcode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}
public class JavaLangPackagePractice2 {


    public static void main(String[] args) {
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        System.out.println(o1.toString());
        System.out.println(o1);
        System.out.println(o2.toString());
        System.out.println(o2);
        System.out.println(o1.hashcode());
        System.out.println(o2.hashcode());
        System.out.println(o1.equals(o2));
    }
    
}
