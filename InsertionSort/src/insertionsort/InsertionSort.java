//Bubble sort code in java
package insertionsort;
import java.util.*;
import java.time.LocalTime;
import java.io.FileWriter;

public class InsertionSort {

    
    public static void main(String[] args) throws Exception {
        FileWriter Writer=new FileWriter("D:/InsertionsortUnsorted.txt");
        FileWriter Writer2=new FileWriter("D:/InsertionsortSorted.txt");
        int A[]=new int[100000];
        int n=100000,key,j;
        Random r=new Random();
        for(int i=0;i<100000;i++){
        A[i]=1+r.nextInt(100); // Generating random numbers 
        }
       
        for(int i=0;i<100000;i++){
             
            Writer.write(A[i]+","); // Writing unsorted numbers into the file
        }
        
        LocalTime starttime=LocalTime.now();
        System.out.println("Sorting started at:"+starttime);
        for(int i=1;i<n;i++){
            key=A[i];
            j=i-1;
            while(j>=0 && A[j]>key)
            {
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=key;
            
            
        }
           
        LocalTime endtime=LocalTime.now();
        System.out.println("Sorting ended at:"+endtime);
        for(int i=0;i<100000;i++){
             
            Writer2.write(A[i]+",");// Writting sorted numbers into the file
        }

        
    }
    
}

