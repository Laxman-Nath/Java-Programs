
package tokenizer;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
  static ArrayList<String> tokenize(String str,String delimeter){
    ArrayList<String> tokens=new ArrayList<>();
    StringBuilder token=new StringBuilder();
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(delimeter.indexOf(c) != -1){
            if(token.length()>0){
                tokens.add(token.toString());
                token.setLength(0);
            }
}
            else{
                token.append(c);
            }
        
    }
        if(token.length()>0){
            tokens.add(token.toString());
        }
        return tokens;
    }
      
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

    
    public static void main(String[] args) throws Exception{
          String input=Files.readString(Path.of("D://input.txt"));
//          String input="hello, world! how are you today";
          ArrayList<String> list=tokenize(input, " ");
          HashMap<String,String> output=new HashMap<>();
//          FileOutputStream fos=new FileOutputStream("D://lexemes.txt");
//          ObjectOutputStream oos=new ObjectOutputStream(fos);
           FileWriter fw=new FileWriter("D://lexemes2.txt");
           PrintWriter pw=new PrintWriter(fw);
          for(String x:list){
           if(isKeyword(x)){
             output.put(x, "keyword");
         }
         else if(isIdentifer(x)){
             output.put(x, "identifier");
         }
         else if(isOpeningSmallBrace(x)){
              output.put(x, "openingsmallbrace");
         }
          else if(isClosingSmallBrace(x)){
                output.put(x, "closingsmallbrace");
         }
         else if(isOpeningCurlyBrace(x)){
               output.put(x, "Openingcurlybrace");
         }
         else if(isLiteral(x)){
                output.put(x, "literal");
        
        }
         else if(isOperator(x)){
               output.put(x, "operator");
                
           }
         
         else if(isClosingCurlyBrace(x)){
               output.put(x, "closingcurlybrace");
         }

          }
        for(Map.Entry<String,String> entry:output.entrySet()){
            pw.println(entry.getKey() +":"+entry.getValue());
        }
//       System.out.println(output);
    }
    
}
