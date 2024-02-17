// Merge sort code in java
package mergesort2;
import java.util.Random;
import java.io.FileWriter;
import java.time.LocalTime;
class Sorting{
    int A[]=new int[100000];
    Random r=new Random();
    void fillingArray(){
        for(int i=0;i<A.length;i++){
            A[i]=r.nextInt(100)+1;
        }
    }
    void storingUnsorted() throws Exception{
        FileWriter f1=new FileWriter("D:/MergeSortUnsorted.txt");
        for(int i=0;i<A.length;i++){
            f1.write(A[i]+",");
    }
    }
     void storingSorted() throws Exception{
        FileWriter f2=new FileWriter("D:/MergeSortSorted.txt");
        for(int i=0;i<A.length;i++){
            f2.write(A[i]+",");
    }
     }
        
    void mergeSort(int A[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(A,l,mid);
            mergeSort(A,mid+1,r);
            merge(A,l,mid,r);
        }
        
    }
    
     void merge(int A[],int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int B[]=new int [r+1];
        while(i<=mid && j<=r){
            if(A[i]<A[j]){
                B[k]=A[i];
                i++;
                k++;
            }
            else{
                B[k]=A[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            B[k]=A[i];
            i++;
            k++;
        }
        while(j<=r){
            B[k]=A[j];
            j++;
            k++;
        }
        for(i=l;i<=r;i++)
        {
            A[i]=B[i];
        }
    }
    
}
public class MergeSort2 {

            
    public static void main(String[] args) throws Exception {
       Sorting s=new Sorting();
       s.fillingArray();
       s.storingUnsorted();
       LocalTime starttime=LocalTime.now();
       System.out.println("Sorting started at:"+starttime);
       s.mergeSort(s.A, 0, s.A.length-1);
       LocalTime endtime=LocalTime.now();
       System.out.println("Sorting ended at:"+endtime);
       s.storingSorted();
    }
    
}
