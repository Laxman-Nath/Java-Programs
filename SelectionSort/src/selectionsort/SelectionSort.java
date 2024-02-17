// Selection sort code in java
package selectionsort;
import java.util.Random;
import java.io.FileWriter;
import java.time.LocalTime;
public class SelectionSort {

   
    public static void main(String[] args) throws Exception{
        FileWriter writer1=new FileWriter("D:/SelectionSortUnsorted.txt");
        FileWriter writer2=new FileWriter("D:/SelectionSortSorted.txt");
        Random r=new Random();
         int temp,n=100000,least;
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=1+r.nextInt(100);
        }
         for(int i=0;i<n;i++){
        writer1.write(A[i]+",");
        }
        LocalTime starttime=LocalTime.now();
        System.out.println("Sorting started at:"+starttime);
        for(int i=0;i<n-1;i++){
            least=i;
            for(int j=i+1;j<n;j++){
                if(A[j]<A[least]){
                    least=j;
                }
            }
//            if(least!=i){
                temp=A[i];
                A[i]=A[least];
                A[least]=temp;
//            }
        }
          LocalTime endtime=LocalTime.now();
        System.out.println("Sorting started at:"+endtime);
        
        for(int i=0;i<n;i++){
        writer2.write(A[i]+",");
        }
        
    }
    
}
