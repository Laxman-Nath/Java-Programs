// Write a java program to add two matrices
package pkg2darraypractice4;


public class Main {


    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{1,1,1}};
        int B[][]={{1,2,1},{1,2,1},{1,11,1}};
        int sum[][]=new int[3][3];
        System.out.println("The first matrix is:");
        for(int x[]:A)
        {
            for(int y:x){
                System.out.print(y+" "
                        + ""
                        + ""
                        + "");
            }
            System.out.println();
        }
        System.out.println("The second matrix is:");
        for(int x[]:B)
        {
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                sum[i][j]=A[i][j]+B[i][j];
            }
        }
         System.out.println("The sum of above two matrix is:");
        for(int x[]:sum)
        {
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
    }
    
}
