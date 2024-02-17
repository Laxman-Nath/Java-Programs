// Generics in java
package genericpractice4;
class Data<T>{
    private T obj;
    public void setData(T obj){
        this.obj=obj;
    }
    public T getData(){
        return this.obj;
}
}
public class GenericPractice4 {

    
    public static void main(String[] args) {
    Data <String> d=new Data<> ();
    d.setData("Hello world");
    System.out.println(d.getData());
    }
    
}
