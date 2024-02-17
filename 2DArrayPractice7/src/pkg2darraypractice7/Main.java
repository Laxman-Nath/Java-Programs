// Write a java program to transpose the matrix
package pkg2darraypractice7;

public class Main {


    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{1,1,1}};
        int trans[][]=new int[3][3];
        System.out.println("The first matrix is:");
        for(int x[]:A)
        {
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                trans[i][j]=A[j][i];
            }
        }
        System.out.println("The transpose of matrix A is:");
                for(int x[]:trans)
        {
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    
}
