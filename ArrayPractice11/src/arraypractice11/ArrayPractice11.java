// Write a java program to reverse copy an array into another array
package arraypractice11;


public class ArrayPractice11 {


    public static void main(String[] args) {
        int A[]={1,2,3,4,5,6,7,8};
        int B[]=new int[10];
        int j=0;
        for(int i=A.length-1;i>=0;i--){
         B[j]=A[i];
         j++;
        }
        for(int i=0;i<A.length;i++){
            System.out.println(B[i]);
        }
             
    }
    
}
