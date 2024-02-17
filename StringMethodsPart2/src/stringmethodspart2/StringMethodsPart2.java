
package stringmethodspart2;


public class StringMethodsPart2 {

    
    public static void main(String[] args) {
       String str="Mr. Shahrukh Khan";
       String str2="www.udemy.co.in";
//       System.out.println(str.startsWith("Mr"));
//       System.out.println(str.startsWith("M"));
//         System.out.println(str.startsWith("shah",4));
//         System.out.println(str.startsWith("Shah",4));

//         System.out.println(str.endsWith("Khan"));

//           System.out.println(str.charAt(4));
//            for(int i=0;i<str.length();i++){
//                System.out.print(str.charAt(i));
//            }

//             System.out.println(str.indexOf("M"));
//             System.out.println(str.indexOf("Shah"));
//               System.out.println(str2.indexOf("."));
//               System.out.println(str2.indexOf(".",4));
//                System.out.println(str2.indexOf(".",10));
                
                System.out.println(str2.lastIndexOf("."));
                System.out.println(str2.lastIndexOf(".",11));
                System.out.println(str2.lastIndexOf(".",8));
    }
    
}
