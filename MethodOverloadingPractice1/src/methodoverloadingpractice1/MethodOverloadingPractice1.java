// Write a java program to demonstrate method overloading
package methodoverloadingpractice1;

public class MethodOverloadingPractice1 {
    static int max(int x,int y){
        return x>y?x:y;
    }
   
    static float max(float x,float y){
        return x>y?x:y;
    }
    static int max(int x,int y,int z){
        return (x>y) && (x>z)?x:(y>z?y:z);
    }
    public static void main(String[] args) {
        byte a=12,b=13;
        System.out.println(max(10,15)); // If there is no int max() method,it will be executed by float max
        System.out.println(max(a,b));// it is executed by int max(int,int) method since there is no byte(byte,byte) method
        System.out.println(max(100.5f,200.5f));
        System.out.println(max(23,234,567));
    }
    
}
