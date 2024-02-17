// inheritance in generics
package genericpractice7;
class MyArray<T>{
    T A[]=(T[]) new Object[10];
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

class MyArray2 extends MyArray<String>{
}
public class GenericPractice7 {

    public static void main(String[] args) {
      MyArray2 m=new MyArray2();
      m.append("Hello i'm ");
      m.append("Laxman");
      m.append("Nath");
      m.display();
    }
    
}
