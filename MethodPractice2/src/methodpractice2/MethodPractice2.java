// Write a java program to demonstrate the passing of objects as parameter in methods java
package methodpractice2;


public class MethodPractice2 {
    static void update(int B[],int index,int value){
        B[index]=value;
    }
    
    static void change(int x,int value){
        x=value;
    }

    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        update(A,2,25);
        for(int x:A){
        System.out.println(x);
       
        }
         int a=10;
        change(a,20);
        System.out.println("The value of a becomes:"+a);
    }
    
}
