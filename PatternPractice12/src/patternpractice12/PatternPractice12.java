// Write a java program to print the following pattern:
//       *
//      ***
//     *****
//    *******
//   *********
         
package patternpractice12;


public class PatternPractice12 {

    
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i+j>5){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            for(int k=1;k<=5;k++){
                if(k==1 && i==1){
                 System.out.print(" ");
                 break;
                }
                else if(k<i){
                  System.out.print("*"+" ");
                }
                else{
                    System.out.print(" ");
                }
                
        }
            System.out.println(" ");
        }
    }
    
}
