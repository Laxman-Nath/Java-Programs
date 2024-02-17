// Remove Special Characters from a strings

package removespecialcharacters;


public class RemoveSpecialCharacters {

  
    public static void main(String[] args) {
         String str="a1@c2d!b#d3";
         System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
    }
    
}
