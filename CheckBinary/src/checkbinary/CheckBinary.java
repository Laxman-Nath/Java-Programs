//Find a number is binary or not
package checkbinary;


public class CheckBinary {

   
    public static void main(String[] args) {
      int binary=1100; 
      String str;
     str=String.valueOf(binary);
     System.out.println(str);
     System.out.println(str.matches("[01]+"));
    }
    
}
