// Write a overloaded methods to find largest among two and three numbers
package methodoverloadingpractice6;
class Test{
    int large(int a,int b){
        return a>b?a:b;
    }
  double large(float a,float b){
     return a>b?a:b;
}
  int large(int a,int b,int c){
      if(a>b && a>c) return a;
      else if(b>c && b>a) return b;
      else return c;
}

}
public class MethodOverloadingPractice6 {

    
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println("The largest integer is:"+t.large(2,3));
        System.out.println("The largest floating number is:"+t.large(3.4f,5.4f));
        System.out.println("The largest integer is :"+t.large(2,6,8));
    }
    
}
