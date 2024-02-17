// Write a java program to display strings using variable arguments
package variableargumentspractice2;


public class VariableArgumentsPractice2 {

  static void showList(int start,String ...name){ // It is to be noted that variable arguments must be last parameter
      for(int i=0;i<name.length;i++){
          System.out.println(start+"."+name[i]);
          start++;
      }
  }
    public static void main(String[] args) {
        showList(5,"Aayansh","Aaradhya","Bikash","Laxman");
    }
    
}
