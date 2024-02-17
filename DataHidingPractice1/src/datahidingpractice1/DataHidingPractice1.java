// Write a java program to demonstrate data hiding
package datahidingpractice1;

class Rectangle{
    private double length;
    private double breadth;
    public void setLength(double l){
        if(l>=0)
          length=l;
        else
            length=0; 
   }
    
    public double getLength(){
        return length;
    }
    public void setBreadth(double b){
        if(b>=0)
            breadth=b;
        else 
            breadth=b;
    }
    public double getBreadth(){
     return breadth;
}
    public double area(){
        return getLength()*getBreadth();
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
public class DataHidingPractice1 {

    
    public static void main(String[] args) {
       Rectangle r=new Rectangle();
       r.setLength(-10.5);
       r.setBreadth(5.5);
       System.out.println("The length of a rectangle is:"+r.getLength());
       System.out.println("The breadth of a rectangle is:"+r.getBreadth());
       System.out.println("The area of a rectangle is:"+r.area());
       System.out.println("The perimeter of a rectangle is:"+r.perimeter());
    }
    
}
