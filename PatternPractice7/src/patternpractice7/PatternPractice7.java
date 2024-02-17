// Write a java program to print the following pattern:
package patternpractice7;


public class PatternPractice7 {

    
    public static void main(String[] args) {
        int i,j;
        
        // First method
//        for( i=5;i>=1;i--){
//            for(j=1;j<=i;j++){
//                System.out.print(+j+" ");
//            }
//            System.out.println("");
//        }

//      Second method
            for( i=1;i<=5;i++){
            for(j=1;j<=5-i+1;j++){
                System.out.print(+j+" ");
            }
            System.out.println("");
        }
    }
    
}
