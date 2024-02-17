// Generics in java
package genericpractice5;
class MyArray<T>{
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
public class GenericPractice5 {

    public static void main(String[] args) {
        MyArray<String> m=new MyArray<>();
        m.append("Hi");
        m.append("Hello");
        m.append("Laxman");
        m.display();
    }
    
}
