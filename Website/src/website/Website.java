// Find the type of website and protocol used
package website;
import java.util.Scanner;
public class Website {

    
    public static void main(String[] args) {
//        String url="https://www.google.com";
          String url;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter URL of website:");
          url=sc.nextLine();
        int i1=url.indexOf(':');
        String str1=url.substring(0,i1);
        int i2=url.lastIndexOf('.');
        String str2=url.substring(i2+1);
//        System.out.println(str2);
        if(str1.equals("http")){
            System.out.println("Hyper text transfer protocol:");
        }
        else if(str1.equals("https")){
             System.out.println("Hyper text transfer protocol secure:");
        } 
        else if(str1.equals("ftp")){
             System.out.println("File transfer protocol:");
        }
        else{
            System.out.println("Invalid protocol:");
        }
        
        if(str2.equals("com")){
            System.out.println("Commercial:");
        }
        else if(str2.equals("org")){
             System.out.println("Organization:");
        } 
        else if(str2.equals("net")){
             System.out.println("Network:");
        }
        else{
            System.out.println("Invalid type:");
        }
    }
    
}
