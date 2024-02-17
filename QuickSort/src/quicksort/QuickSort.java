
package quicksort;
import java.util.Random;
import java.io.FileWriter;
import java.time.LocalTime;

class Sorting{
    int A[]=new int[1000000];
    Random r=new Random();
        void fillingArray(){
        for(int i=0;i<A.length;i++){
            A[i]=r.nextInt(100)+1;
        }
    }
    void storingUnsorted() throws Exception{
        FileWriter f1=new FileWriter("D:/QuickSortUnsorted.txt");
        for(int i=0;i<A.length;i++){
            f1.write(A[i]+",");
    }
    }
     void storingSorted() throws Exception{
        FileWriter f2=new FileWriter("D:/QuickSortSorted.txt");
        for(int i=0;i<A.length;i++){
            f2.write(A[i]+",");
    }
     }
    public void quickSort(int A[],int l,int r){
        if(l<r){
            int p=partition(A,l,r);
            
            quickSort(A,l,p-1);
            
            
            quickSort(A,p+1,r);
            
        }
    }
    public int partition(int A[],int l,int r){
         int p=A[l];
         int i=l;
         int j;
       
        for(j=l+1;j<=r;j++){
            if(A[j]<=p){
                i++;
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        int temp=A[i];
        A[i]=A[l];
        A[l]=temp;
        
        return i;
    }
}
        
public class QuickSort {


    public static void main(String[] args) throws Exception {
      
      Sorting s=new Sorting();
       s.fillingArray();
       s.storingUnsorted();
       LocalTime starttime=LocalTime.now();
       System.out.println("Sorting started at:"+starttime);
       s.quickSort(s.A, 0, s.A.length-1);
       LocalTime endtime=LocalTime.now();
       System.out.println("Sorting ended at:"+endtime);
       s.storingSorted();
     
    }
    
}
