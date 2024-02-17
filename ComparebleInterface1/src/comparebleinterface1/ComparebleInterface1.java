// when we want the treeset to store the object of userdefined class,the class should implement Comparable interface
package comparebleinterface1;
import java.util.*;
class Point implements Comparable{
    int x, y;
    Point (int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return this.x+","+this.y;
    }
    public int compareTo(Object o){
       Point p=(Point) o;
       if(this.x<p.x){
           return -1;
       }
       else if(this.x>p.x){
           return 1;
       }
       else{
           if(this.y<p.y){
               return -1;
           }
         else  if(this.y>p .y){
              return 1; 
           }
         else{
             return 0;
         }
           }
       
    }
}
public class ComparebleInterface1 {

    public static void main(String[] args) {
        TreeSet<Point> t1=new TreeSet<>();
        t1.add(new Point(1,1));
        t1.add(new Point(5,5));
        t1.add(new Point(5,2));
        System.out.println(t1);
    }
    
}
