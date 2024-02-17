// Passing multiple parameters to generic classes
package genericpractice11;
class Data<T,U>{
    T obj1;
    U obj2;
    public void setData(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public void print(){
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }
}
public class GenericPractice11 {

    public static void main(String[] args) {
        Data <Integer,String> d1=new Data<>();
        d1.setData(12, "Laxman");
        d1.print();
        
        Data <String,Boolean> d2=new Data<>();
        d2.setData( "Laxman",true);
        d2.print();
    }
    
}
