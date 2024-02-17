// Write a java program to create gagged array
package pkg2darraypractice2;


public class Main {


    public static void main(String[] args) {
        int A[][];
        A=new int[3][];
        A[0]=new int[2];
        A[1]=new int[3];
        A[2]=new int[4];
        A[0][0]=1;
        A[0][1]=2;
        A[1][0]=3;
        A[1][1]=4;
        A[1][2]=5;
        A[2][0]=6;
        A[2][1]=7;
        A[2][2]=8;
        A[2][3]=9;
        for(int x[]:A){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
    }
    
}
