//wildcard for defining generic parameter in java
package genericpractice16;

import java.beans.AppletInitializer;

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
public class GenericPractice16 {
    static void show(myArray<? extends Number> obj){ // here ? is unbounded wildcard and Number is
//        upperbound (note in upper bound we use extends and lower bound is used with super)


        obj.display();
    }
    public static void main(String[] args) {
        myArray<String> m1=new myArray<>();
        m1.append("Laxman");
        m1.append("Nath");
        show(m1);
        
         myArray<Integer> m2=new myArray<>();
        m2.append(23);
        m2.append(45);
        show(m2);
    }
    
}
