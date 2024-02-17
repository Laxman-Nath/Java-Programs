// Write a java program to print multlipication from 2 to 10
package looppractice19;
public class LoopPractice19 {

    
    public static void main(String[] args) {
      int i,j;
      for( i=2;i<=10;i++){
          System.out.println("Multlipication table of:"+i);
          System.out.println("************************************");
          for( j=1;j<=10;j++){
              System.out.println(+i+" X "+ j+"="+ (j*i));
          }
          System.out.println("************************************");
      }
    }
    
}
