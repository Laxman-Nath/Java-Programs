
package removeextraspaces;


public class RemoveExtraSpaces {


    public static void main(String[] args) {
        String str=" L   ax    ma n ";
        System.out.println(str.replaceAll("\\s+"," ").trim());
    }
    
}
