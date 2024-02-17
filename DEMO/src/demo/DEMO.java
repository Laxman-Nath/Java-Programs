
package demo;
class parent{
    int x,y;
}
class child extends parent{
    int z;
    public child(){
        System.out.println("parent");
    }
}
public class DEMO {


    public static void main(String[] args) {
        child c=new child();
    }
    
}
