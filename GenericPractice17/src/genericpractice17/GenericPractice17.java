// lower bound in generics
package genericpractice17;
class A{}
class B extends A{}
class C extends B{}
class myArray<T>{
    T A[]=(T[])new Object[10];
    int length=0;
    public void append(T v){
        A[length++]=v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
public class GenericPractice17 {
static  void show(myArray<? super B>  obj){
    obj.display();
}
  
    public static void main(String[] args) {
        myArray <C> m1=new myArray<>();
        myArray <B> m2=new myArray<>();
        myArray <A> m3=new myArray<>();
        
        
        show(m1);
        show(m2);
        show(m3);
        
    }
    
}
