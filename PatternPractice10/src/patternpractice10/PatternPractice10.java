// Write a java program to create the following pattern:
//* * * * *
//  * * * *
//    * * *
//      * *
//        *
package patternpractice10;


public class PatternPractice10 {

    
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>=i){
                System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println("");
            }
    }
    
}
