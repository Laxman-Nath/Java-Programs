// Write a java program to create a class Cylinder with suitable methods,properties and constructors

package constructorspractice2;

class Cylinder{
    private double radius;
    private double height;
   public double getRadius(){
       return radius;
   }
   public void setRadius(double r){
       if(r<0)
           radius=0;
       else
           radius=r;
   }
    public double getHeight(){
       return height;
   }
   public void setHeight(double h){
       if(h<0)
           height=0;
       else
           height=h;
   }  
    public Cylinder(){
        radius=1;
        height=1;
    }
    public Cylinder(double r){
        setRadius(r);
    }
    public Cylinder(double r,double h){
        setRadius(r);
        setHeight(h);
    }
    public double totalArea(){
        return 2*Math.PI*radius*(height+radius);
    }
    
}
public class ConstructorsPractice2 {

  
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        Cylinder c2=new Cylinder(2);
         Cylinder c3=new Cylinder(2,3);
         System.out.println("The radius and height for cylinder 1 is:"+c1.getRadius()+","+c1.getHeight());
         System.out.println("The radius and height for cylinder 2 is:"+c2.getRadius()+","+c2.getHeight());
          System.out.println("The radius and height for cylinder 3 is:"+c3.getRadius()+","+c3.getHeight());
    }
    
}
