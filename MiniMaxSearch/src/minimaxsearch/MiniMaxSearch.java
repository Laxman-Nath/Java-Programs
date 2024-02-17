
package minimaxsearch;


public class MiniMaxSearch {
    int max=0,min=0;
    int mid,min1=0,max1=0,min2=0,max2=0;
  int[] minimax(int A[],int l,int r){
      
        if(l==r){
            min=max=A[l];
       
        }
        else if(l+1==r){
            if(A[l]<A[r]){
                min=A[l];
                max=A[r];
            }
            else{
                min=A[r];
                max=A[l];
            }
        }
        else{
            mid=(l+r)/2;
            int C[]= minimax(A,l,mid);
            int D[]=minimax(A,mid+1,r);
            if(C[0]>D[0]){
                max=C[0];
            }
            else{
                max=D[0];
            }
             if(C[1]<D[1]){
                min=C[1];
            }
            else{
                min=D[1];
            }
            }
      int output[]={max,min};
      return output;
  }
    
    public static void main(String[] args) {
       int A[]={2,3,4,5,6,7,1};
        MiniMaxSearch m=new MiniMaxSearch();
       int B[]= m.minimax(A, 0, 6);
        System.out.println("The maximum element is:"+B[0]);
        System.out.println("The minimum element is:"+B[1]);
       
               
    }
    
}
