// Write a java program to find the sum of squares of diagnol element of square matrix
package pkg2darraypractice10;


public class Main {


    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(i==j){
                    sum+=A[i][j]*A[i][j];
                }
            }
            }
        System.out.println("The sum of squares of diagnol elements of square matrix is:"+sum);
    }
    
}
