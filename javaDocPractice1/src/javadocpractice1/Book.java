
/**
 * 
 *@author Laxman nath
 * @version 3.0
 * @since 2015
 **/
package javadocpractice1;

/**
 *
 * @author laxman nath
 *  
 * Class for Library book
 */

public class Book{
/**
 * 
 * @value 10 default value
 */
    static int val=10;
    

   /**
    * Parameterized constructor
    * @param s Book name
    */
    
       public Book(String s){
       
   }
      
       /**
        * Issue a Book to a Student
        * @param roll roll number of a Student
        * @throws Exception  if book is not available,throws Exception
        */
       public void issue(int roll) throws Exception{
           
       }
       
       /**
        * check if book is available
        * @param str Book name
        * @return  if book is available returns true else false
        */
       
       public boolean available(String str){
           return true;
       }
       
       /**
        * Get Book name
        * @param id book id
        * @return returns book name
        */
       
       public String getName(int id){
           return "";
       }
}


