// Dispalay the type of website using switch in java
package switchpractice4;
import java.util.Scanner;
public class SwitchPractice4 {

    public static void main(String[] args) {
        String url;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter url of a website:");
        url=sc.nextLine();
        String type=url.substring(url.lastIndexOf('.')+1);
//        System.out.println(type);
        switch(type){
            case "com":
                System.out.println("Commercial:");
                break;
            case "org":
                System.out.println("Organisation:");
                break;
            case "gov":
                System.out.println("Government:");
                break;
            case "net":
                System.out.println("Network:");
                break;
            default:
                System.out.println("Invalid type:");
        }
        }
            
    }
    

