//Find if the data in date format dd/mm/yyyy
package checkdate;


public class CheckDate {

   
    public static void main(String[] args) {
        String d="01/12/2000";
        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
    
}
