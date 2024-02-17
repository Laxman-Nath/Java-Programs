// Write a java program to create a class Product using suitable properties,methods and constructors
package constructorspractice3;
class Product{
    private int itemno;
    private String name;
    private double price;
    private int qty;
    public int getItemNo(){
        return itemno;
    }
    
    public String getName(){
        return name;
    }
    public void setPrice(double p){
        price =p;
    }
    public double getPrice(){
        return price;
    }
    public void setQty(int q){
        qty=q;
        
    }
    public int getQty(){
        return qty;
    }

    public Product(int i){
        itemno=i;
    }
    public Product(int i,String s){
        itemno=i;
        name=s;
    }
    public Product(int i,String s,double p){
        itemno=i;
        name=s;
        price=p;
    }
    public Product(int i,String s,double p,int q){
        itemno=i;
        name=s;
        price=p;
        qty=q;
    }
        
}
public class ConstructorsPractice3 {

    
    public static void main(String[] args) {
        Product p2=new Product(4);
        Product p3=new Product(4,"cocacola");
        Product p4=new Product(5,"Bat",123.34);
        Product p5 =new Product(7,"Dew",78.0,10);
    }
    
}
