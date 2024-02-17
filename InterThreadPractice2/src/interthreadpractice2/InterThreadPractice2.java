// Interthread communication in java
package interthreadpractice2;
class whiteBoard{
    String text;
    int noOfStudents=0;
    int count=0;
    public void attendance(){
        noOfStudents++;
    }
    synchronized void write(String message){
        while(count!=0){
            try{wait();}catch(Exception e){}
        }
        System.out.println("Teacher is writting "+message);
            text=message;
            count=noOfStudents;
            notifyAll();
        
    }
    synchronized String read(){
        while(count==0){
            try{wait();}catch(Exception e){}
        }
        String msg;
        msg=text;
        count--;
        if(count==0){
        notify();
                }
        return msg;
    }
}

class Teacher extends Thread{
    whiteBoard b;
    Teacher(whiteBoard b){
        this.b=b;
    }
    String A[]={"Java is a language","It is a OOps","It supports multithreading","end"};
    public void run(){
        for(int i=0;i<A.length;i++){
           b.write(A[i]);
        }
    }
}

class Students extends Thread{
    String name;
    whiteBoard b;
    Students(whiteBoard b,String name){
        this.name=name;
        this.b=b;
    }
    public void run(){
        b.attendance();
        String text;
        do{
            
            text=b.read();
            System.out.println(name+" Reading "+text);
            System.out.flush();
            
        }while(!text.equals("end"));
    }
}

public class InterThreadPractice2 {

    
    public static void main(String[] args) {
      whiteBoard b=new whiteBoard();
      Teacher t=new Teacher(b);
      Students s1=new Students(b,"1).laxman");
       Students s2=new Students(b,"2).bikash");
        Students s3=new Students(b,"3).harish");
     Students s4=new Students(b,"4).rohit");
     t.start();
     
     s1.start();
     s2.start();
     s3.start();
     s4.start();
    }
    
}
