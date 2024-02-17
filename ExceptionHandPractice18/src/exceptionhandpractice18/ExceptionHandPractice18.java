// Creating userdefined exception
package exceptionhandpractice18;
import java.util.Scanner;
class stackOverFlow extends Exception{
    @Override
   public String toString(){
        return "Stack is full";
    }
}
class stackUnderFlow extends Exception{
    @Override
   public String toString(){
        return "Stack is empty";
    }
}

class stack{
    Scanner sc=new Scanner(System.in);
    int top=-1;
    int size=5;
    int A[]=new int[size];
    void push()throws stackOverFlow{
        if(top==size-1){
            throw new stackOverFlow();
        }
        else{
            top++;
            System.out.println("Enter number to be inserted:");
            int z=sc.nextInt();
            A[top]=z;
        }
    }
        void pop() throws stackUnderFlow {
        if(top<0){
            throw new stackUnderFlow();
        }
        else{
            System.out.println("The deleted element is:"+A[top]);
            top--;
        }
    }
}
    

public class ExceptionHandPractice18 {

    
    public static void main(String[] args) {
        stack s=new stack();
        try{
            s.push();
            s.push();
            s.push();
            s.push();
            s.push();
            s.push();
//            s.pop();
        }
        catch(stackOverFlow s1){
            System.out.println(s1);
        }
//        catch(stackUnderFlow s2){
//            System.out.println(s2);
//        }
    }
    
}
