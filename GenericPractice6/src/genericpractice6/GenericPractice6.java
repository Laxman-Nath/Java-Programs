// Generics in java
package genericpractice6;
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
public class GenericPractice6 {

 
    public static void main(String[] args) {
        MyArray m=new MyArray();
        m.append(10);
        m.append("Hello");
        m.append('c');
        m.display();
    }
    
}
