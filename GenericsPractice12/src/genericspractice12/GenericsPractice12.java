// Sorting different types of data using generics
package genericspractice12;
class sorting<T extends Comparable<T>>{
       public void swap(int i,int j ,T a[]){
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public void sort(T [] a){
        int n=a.length;
        for(int i=0;i< n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j].compareTo(a[j+1])>0){
                    swap(j,j+1,a);
                }
                }
                }
                    
    }
    
    public void print(T a[]){
        for(T x:a){
            System.out.println(x);
        }
        }
 

}
    
public class GenericsPractice12 {

    
    public static void main(String[] args) {
        sorting <Integer> i=new sorting<>();
        Integer A[]={6,5,1,2,4};
        i.sort(A);
        i.print(A);

//sorting <Character> i=new sorting<>();
//        Character A[]={'I','J','B','A'};
//        i.sort(A);
//        i.print(A);
    }
    
}
