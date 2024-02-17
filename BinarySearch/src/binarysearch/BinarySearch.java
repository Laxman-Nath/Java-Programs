// Binary Search code in java
package binarysearch;


public class BinarySearch {
 static int binary(int A[],int l,int r,int key){
     int mid;
     if(l<=r){
         mid=(l+r)/2;
         if(A[mid]==key){
             return mid;
         }
         else if(key<A[mid]){
             return binary( A, l, mid-1, key);
         }
         else{
             return binary( A,mid+1,r,key);
         }
     }
     
     return -1;
 }
         
    public static void main(String[] args) {
//        int A[]=new int[5];
      BinarySearch b=new BinarySearch();
     int A[]={1,2,3,4,5};
     int key=1;
     int index=binary(A,0,4,key);
     if(index==-1){
     System.out.println("The element is not  found :");
     }
     else{
         System.out.println("The element is found at index:"+index);
     }
    }
    
}
