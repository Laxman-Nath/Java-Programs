// Another mehthods for method overriding
package methodoverridingpractice2;
class TV{
    void SwitchOn(){
        System.out.println("TV is swithed on:");
    }
    
    void ChangeChannel(){
        System.out.println("Changing channel on TV:");
    }
}
class SmartTV extends TV{
    @Override
    void SwitchOn(){
        System.out.println("SmartTV is swithed on:");
    }
    @Override
    void ChangeChannel(){
        System.out.println("Changing channel on SmartTV:");
    }
    void Browse(){
        System.out.println("Browsing on SmartTV:");
    }
}
public class MethodOverridingPractice2 {

 
    public static void main(String[] args) {
//        TV t=new TV();
//         t.SwitchOn();
//        t.ChangeChannel();
//        
//        SmartTV s=new SmartTV();
//        s.SwitchOn();
//        s.Browse();
//        s.ChangeChannel();

// Dynamic method dispatch
      TV t=new SmartTV();
      t.SwitchOn();
      t.ChangeChannel();
//      t.Browse();  --> This cannot be called because TV class does not have browse method.

       
    }
    
}
