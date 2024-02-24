
package lexicalanalyzer2;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.regex.*;
import javax.management.ObjectName;

public class LexicalAnalyzer2 {
static boolean isIdentifer(String str){
        String regex="\\b[a-zA-Z_][a-zA-Z0-9_]*\\b";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        return m.matches();
}
static boolean isKeyword(String str){
    ArrayList<String> keywords=new ArrayList<>(Arrays .asList("void","int","float",
            "main", "getch"));
    for(String x:keywords){
        if(x.equals(str)){
            return true;
        }
       
    }
    return false;
}

static boolean isOpeningSmallBrace(String str){
    if(str.equals("(")){
        return true;
    }
    else{
        return false;
    }
}

static boolean isClosingSmallBrace(String str){
    if(str.equals(")")){
        return true;
    }
    else{
        return false;
    }
}

static boolean isOpeningCurlyBrace(String str){
    if(str.equals("{")){
        return true;
    }
    else{
        return false;
    }
}

static boolean isClosingCurlyBrace(String str){
    if(str.equals("}")){
        return true;
    }
    else{
        return false;
    }
}

static boolean isOperator(String str){
       String regex="[-+=*%]";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        return m.matches();
}

static boolean isLiteral(String str){
       String regex="[0-9]+";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        return m.matches();
}
   

  


    public static void main(String[] args) throws Exception {
      String input=Files.readString(Path.of("D://input.txt"));
      String [] words=input.split("\\s");
      Properties p=new Properties();
      FileOutputStream fos=new FileOutputStream("D://output2.txt");
      for(int i=0;i<words.length;i++){
         if(isKeyword(words[i])){
             p.setProperty(words[i], "keyword");
         }
         else if(isIdentifer(words[i])){
            p.setProperty(words[i], "Identifier");
         }
         else if(isOpeningSmallBrace(words[i])){
             p.setProperty(words[i], "Openingsmallbrace");
         }
          else if(isClosingSmallBrace(words[i])){
               p.setProperty(words[i], "Closingsmallbrace");
         }
         else if(isOpeningCurlyBrace(words[i])){
               p.setProperty(words[i], "Openingcurlybrace");
         }
         else if(isLiteral(words[i])){
               p.setProperty(words[i], "literal");
        
        }
           if(isOperator(words[i])){
               p.setProperty(words[i], "Operator");
                
           }
         


          else if(isClosingCurlyBrace(words[i])){
              p.setProperty(words[i], "closingcurlybrace");
         }
      }
    
      p.store(fos, "tokens");
      fos.close();
      
    }
    
}
