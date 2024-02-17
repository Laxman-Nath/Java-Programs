// Demonstration of two dimensional array
package pkg2darraypractice1;


public class Main {

   
    public static void main(String[] args) {
        // Declaring 2-D array
        int A[][]=new int[5][5];
        
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};
        
//        int C[][];
//        C=new int[5][5];

//        int [][]D=new int[4][4];

//            int []D[]=new int[4][4];

//            int []E,F[]; // Here E is 1-D array and F is 2-D array\

//            int [] G,H,I,J; // Here all are one dimensional arrays

//            int [] G,H,I,J[]; // Here all are one dimensional arrays except J which is two dimensional array

    // Displaying elements of 2-D array
       // Using for loop
//       for(int i=0;i<B.length;i++){
//           for(int j=0;j<B[0].length;j++){
//               System.out.print(B[i][j]+" ");
//           }
//           System.out.println();
//       }
       // Using for each loop
       for(int x[]:B){
           for(int y:x){
               System.out.print(y+" ");
           }
           System.out.println();
       }
    }
    
}
