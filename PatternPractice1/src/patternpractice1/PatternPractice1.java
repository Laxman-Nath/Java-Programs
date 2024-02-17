// Write a java program to draw the following pattern:
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
package patternpractice1;


public class PatternPractice1 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
