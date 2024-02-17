// Write a java program to print the following pattern:
//           *
//        *  *
//     *  *  *
//  *  *  *  *
//* *  *  *  *
package patternpractice11;

public class PatternPractice11 {

    
    public static void main(String[] args) {
        // First Approach
//        
//        for(int i=5;i>=1;i--){
//            for(int j=1;j<=5;j++){
//                if(j>=i){
//                    System.out.print("*"+" ");
//                }
//                else{
//                    System.out.print(" "+" ");
//                }
//            }
//            System.out.println();
//        }

// Second Approach
         for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
       }
      
    }
    
}
