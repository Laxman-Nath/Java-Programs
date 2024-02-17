// Write a java program to remove special characters from string
package stringpractice11;

public class StringPractice11 {

    
    public static void main(String[] args) {
        String str="123qehsj*&$4#";
           System.out.println(str.replaceAll("[^A-Za-z1-9]",""));
            }
    
}
