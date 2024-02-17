// Write a java program to multiply two matrices
package pkg2darraypractice5;


public class Main {


    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{1,1,1}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        int mul[][]=new int[3][3];
        System.out.println("The first matrix is:");
        for(int x[]:A)
        {
            for(int y:x){
                System.out.print(y+" ");
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
                mul[i][j]=0;
                for(int k=0;k<A.length;k++)
                mul[i][j]=mul[i][j]+A[i][k]*B[k][j];
            }
        }
         System.out.println("The multlipication of above two matrix is:");
        for(int x[]:mul)
        {
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
    }
    
}

