//  Generics method in java
package genericpractice13;
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
public class GenericPractice13 {
static <E> void show(E[] list){  // This is generic method
    for(E x:list){
        System.out.println(x);
    }
}
    public static void main(String[] args) {
        show(new String[]{"Laxman","Hello","World"});
        show(new Integer[]{1,2,3,4,4,5});
    }
    
}
