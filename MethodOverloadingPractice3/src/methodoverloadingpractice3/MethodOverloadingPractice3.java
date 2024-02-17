// Write a java program to overload method to reverse a int or array
package methodoverloadingpractice3;

       
public class MethodOverloadingPractice3 {

    static int reverse(int n){
   int rem;
   int rev=0;
     
   while(n!=0){
     rem=n%10;
     rev=rem+rev*10;
     n=n/10;
}
  return rev;

}
    static int [] reverse(int A[]){
        int B[]=new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++){
            B[j]=A[i];
        }
        return B;
    }
            
    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6};
        int B[]=new int[A.length];
        System.out.println("The reverse of 523 is "+reverse(523));
         B=reverse(A);
        for(int i=0;i<B.length;i++){
            System.out.println(B[i]);
        }
    }
    
}
