// Implementing chi square test for uniformity testing
package simulation2;
import java.util.*;
class chisquare{
    Scanner sc=new Scanner(System.in);
    Random r=new Random(); // Creating object of random class to generate random numbers
    int n;// Numers of random numbers to be generated
    int intervals=10; //no. of intervals
    float tabulated_value=16.919f; // tabulated value
    int A[]=new int[100]; // Array for storing generated numbers
    int lb[]={0,10,20,30,40,50,60,70,80,90}; // lower bounds
    int ub[]={9,19,29,39,49,59,69,79,89,99}; // upper bounds
    int observed[]=new int[intervals]; // observed frequencies
    int N;// total of observed frequency=total of excepted frequency
    int expected;// expected frequency is same for all interval
    float calculation[]= new float[20]; // it store value after(oi-ei) square ei
    float fin=0.0f; // final result
    
    void showHypothesis(){
        System.out.println("/***************************************************/");
        System.out.println("Null Hypothesis:The numbers are uniformly distributed:");
        System.out.println("Alternate Hypothesis:The numbers are not uniformly distributed:");
         System.out.println("/***************************************************/");
    
    }
    
    void randomNumberGenerator(){
         System.out.println("Enter number of random numbers to be generated:");
         n=sc.nextInt();
        for(int i=0;i<n;i++){
            A[i]=r.nextInt(100);
        }
    }
    void display(){
        System.out.println("The random numbers generated are:");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
    }
    void calculateObserved(){
        for(int i=0;i<n;i++){
            for(int j=0;j<intervals;j++){
                if(A[i]>=lb[j] && A[i]<=ub[j]){
                    observed[j]++;
                    break;
                }
            }
        }
    }
    
  void finalCalculation(){
       expected=n/intervals;
      for( int i=0;i<intervals;i++){
          calculation[i]=(float)((observed[i]-expected)*(observed[i]-expected))/expected;
          fin=fin+calculation[i];
          N=N+observed[i];
      }
  }
   void table(){
       System.out.println("/****************************************/");
       System.out.println(String.format("%s %10s %10s %20s ","S.N ","Oi", "Ei" ,"(Oi-Ei)*(Oi-Ei)/Ei"));
       for(int i=0;i<10;i++){
       System.out.println(String.format("%s %12s %11s %18s ",i+1,observed[i],expected,calculation[i]));
       }
       System.out.println("/****************************************/");
       System.out.println(String.format("%12s %25s",N,fin));
   }
  
   void result(){
       if(fin<=tabulated_value){
           System.out.println("The calculated value: "+fin+"<="+tabulated_value+" So"
                   + " the null hypothesis is not rejected");
       }
       else{
           System.out.println("The calculated value: "+fin+">"+tabulated_value+" So"
                   + " the null hypothesis is  rejected");
       }
   }
       
    
}

public class Simulation2 {
   
    public static void main(String[] args) {
      
      chisquare c=new chisquare();
      c.randomNumberGenerator();
      c.display();
      c.showHypothesis();
      c.calculateObserved();
      c.finalCalculation();
      c.table();
      c.result();
    }
}
