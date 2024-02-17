//Bubble sort code in java
package bubblesort;
import java.util.*;
import java.time.LocalTime;
import java.io.FileWriter;

public class BubbleSort {

    
    public static void main(String[] args) throws Exception {
        FileWriter Writer=new FileWriter("D:/BubblesortUnsorted.txt");
        FileWriter Writer2=new FileWriter("D:/BubblesortSorted.txt");
        int A[]=new int[100000];
        int temp,n=100000;
        Random r=new Random();
        for(int i=0;i<100000;i++){
        A[i]=1+r.nextInt(100); // Generating random numbers 
        }
       
        for(int i=0;i<100000;i++){
             
            Writer.write(A[i]+","); // Writing unsorted numbers into the file
        }
        
        LocalTime starttime=LocalTime.now();
        System.out.println("Sorting started at:"+starttime);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        LocalTime endtime=LocalTime.now();
        System.out.println("Sorting ended at:"+endtime);
        for(int i=0;i<100000;i++){
             
            Writer2.write(A[i]+",");// Writting sorted numbers into the file
        }

        
    }
    
}
