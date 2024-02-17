// Write a program that takes your full name as input and displays the abbreviations of the first and middle names
//except the last name which is displayed as it is
package stringpractice7;


public class StringPractice7 {


    public static void main(String[] args) {
        String str="Laxman bahadur nath";
        str=str.replace("Laxman","L.");
        str=str.replace("bahadur","b.");
        System.out.println(str);
           }
    
}
