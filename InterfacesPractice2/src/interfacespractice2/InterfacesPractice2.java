// Create a class phone and two interfaces camera and musicplayer including suitable methods in all of these.
// Also create another class smartphone which extends and implements all of these
package interfacespractice2;
class phone{
    void call(){
        System.out.println("Calling from phone....");
    }
    void sms(){
        System.out.println("Sending sms from phone...");
    }
}
interface Icamera{
    void click();
     void record();
}
interface ImusicPlayer{
    void play();
    void pause();
    void stop();
}

class smartPhone extends phone implements Icamera,ImusicPlayer{
    void videoCall(){
        System.out.println("Video calling from smartphone...");
    }
     public void click(){
        System.out.println("Clicking photo from smartphone...");
    }
   public void record(){
        System.out.println("Recording video from smartphone...");
    }
   public void play(){
       System.out.println("Playing music from smartphone....");
   }
  public void pause(){
      System.out.println("Pausing from smartphone....");
  }
  public void stop(){
      System.out.println("Stopping from smartphone...");
  }
}
public class InterfacesPractice2 {

    
    public static void main(String[] args) {
       smartPhone s=new smartPhone();
       phone p=s;
       Icamera c=s;
       ImusicPlayer m=s;
       s.videoCall();
       p.call();
       p.sms();
       c.click();
       c.record();
       m.play();
       m.pause();
       m.stop();
    }
    
}
