//Find if the email id is on gmail 
//Find username and domainname from gmail
package emailverification;


public class EmailVerification {

    
    public static void main(String[] args) {
      String str="laxman123@gmail.com";
//       System.out.println(str.matches("(\\w*)@gmail(.*)"));
      int index1=str.indexOf('@');
      String username=str.substring(0, index1);
      String domainname=str.substring(index1+1,str.length());
      System.out.println("The username is:"+username);
      System.out.println("The domain name is:"+domainname);
//      System.out.println(domainname.startsWith("gmail"));
      int index2=domainname.indexOf('.');
      String str3=domainname.substring(0,index2);
      System.out.println(str3.equals("gmail"));
    }
    
}
