// Write a java program to find sum of each row in a matrix
package pkg2darraypractice8;

public class Main {

    
    public static void main(String[] args) {
        int A[][]={{1,0,0},{0,1,0},{0,0,1}};
        int sum;
        for(int i=0;i<A.length;i++){
            sum=0;
            for(int j=0;j<A[i].length;j++){
                sum=sum+A[i][j];
            }
            System.out.println("The sum of row "+ (i+1)+" is "+sum);
        }
    }
    
}
