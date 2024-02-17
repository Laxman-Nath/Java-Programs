// Write a java program to print the following pattern:
// 1
// 2  3
// 4  5  6
// 7   8   9   10
// 11  12  13  14  15
package patternpractice6;


public class PatternPractice6 {

    
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.format("%02d",count);
                System.out.print(" ");
                
            }
            System.out.println();
        }
                
    }
    
}
