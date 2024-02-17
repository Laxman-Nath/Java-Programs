// Write a java program to print the following pattern:
// 2 3 4 5 6
// 3 4 5 6 7
// 4 5 6 7 8
// 5 6 7 8 9
// 6 7 8 9 10
package patternpractice3;

public class PatternPractice3 {

    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                System.out.print((i+j)+" ");
            }
            System.out.println();
        }
    }
    
}
