
package lexicalanalyzer;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.*;

public class LexicalAnalyzer {
static boolean isIdentifer(String str){
        String identifer="[_$a-zA-Z][a-zA-Z\\d$]* ";
        Pattern p=Pattern.compile(identifer);
        Matcher m=p.matcher(str);
        return m.matches();
}
static boolean isKeyword(String str){
    ArrayList<String> keywords=new ArrayList<>(Arrays .asList("void","int","float"));
    for(String x:keywords){
        if(x.equals(str)){
            return true;
        }
       
    }
    return false;
}

    public static void main(String[] args) throws Exception {
      String input=Files.readString(Path.of("D://input.txt"));
        PrintWriter fos=new PrintWriter("D://output.txt");
      String [] words=input.split("\\s");
  
      for(int i=0;i<words.length;i++){
//          System.out.println(words[i]);

            System.out.println(isIdentifer(words[0]));
//          if(isKeyword(words[i]))
//          System.out.println(words[i]);
      }
    
      
    }
    
}
