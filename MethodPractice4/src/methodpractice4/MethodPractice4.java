// Write a java program to add two numbers using method in java
package methodpractice4;


public class MethodPractice4 {

static int add(int x,int y){
    int z=x+y;
    return z;
}
    public static void main(String[] args) {
       int a=10,b=4,c;
       c=add(a,b);
       System.out.println("The sum is "+c);
    }
    
}
