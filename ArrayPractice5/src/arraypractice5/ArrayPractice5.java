// Write a java program for finding the second maximum element in an array
package arraypractice5;


public class ArrayPractice5 {

    
    public static void main(String[] args) {
        int A[]={1,2,80,4,5,78,90};
        int max1,max2;
        max1=max2=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max1){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("Second largest element is:"+max2);
    }
    
}
