
package stringpool;


public class StringPool {

   
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3="java";
        String str4=new String("Java");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
            }
    
}
