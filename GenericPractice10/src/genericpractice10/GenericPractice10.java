// bounded type generics in java
package genericpractice10;
class A{};
class B extends A{};
class C extends B{};
class MyArray <T extends A>{
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
public class GenericPractice10 {

   
    public static void main(String[] args) {
        MyArray <A> m=new MyArray();
         MyArray <B> m1=new MyArray();
          MyArray <C> m2=new MyArray();
    }
    
}
