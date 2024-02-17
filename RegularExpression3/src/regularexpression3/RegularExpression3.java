
package regularexpression3;


public class RegularExpression3 {

    
    public static void main(String[] args) {
//        String str1="abc";
//        System.out.println(str1.matches(".*"));

     String str1="abcdefgghi";
     String str2="aAbB";
     String str3="";
     String str4="abc";
     String str5="acc";
       String str6="accbbb";
        System.out.println(str1.matches("[a-z]*"));
        System.out.println(str2.matches("[a-z]*"));
        System.out.println(str3.matches("[abc]*"));
        System.out.println(str3.matches("[abc]+"));
        System.out.println(str4.matches("[abc]+"));
         System.out.println(str4.matches("[abc]{3}"));
         System.out.println(str5.matches("[abc]{3}"));
         System.out.println(str6.matches("[abc]{3,8}"));
    }
    
}
