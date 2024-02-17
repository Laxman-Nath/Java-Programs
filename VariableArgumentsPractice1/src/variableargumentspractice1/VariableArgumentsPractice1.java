// Write a java program to demonstrate variable arguments
package variableargumentspractice1;

public class VariableArgumentsPractice1 {
   static void show(int ...A){
       for(int x:A){
           System.out.println(x);
       }
   }
    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{1,2,3,4,5,6,7,8});// This is a anoynymous array since it has no reference
                
    }
    
}
