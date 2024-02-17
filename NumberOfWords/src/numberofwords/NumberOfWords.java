// Find number of words in a string
package numberofwords;


public class NumberOfWords {

    
    public static void main(String[] args) {
       String str="abc de fg hi";
        String str2[]=str.split("\\s");
        System.out.println(str2.length);
    }
    
}
