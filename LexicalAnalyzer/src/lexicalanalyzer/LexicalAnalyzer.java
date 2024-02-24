
package lexicalanalyzer;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;


public class LexicalAnalyzer {
   

    public LexicalAnalyzer() {
    }


    public static void main(String[] args) throws Exception {
      String input=Files.readString(Path.of("D://input.txt"));
        PrintWriter fos=new PrintWriter("D://output.txt");
      String [] words=input.split("\\s");
      for(int i=0;i<words.length;i++){

              if(!words[i].equals(";"))
              {  
                fos.write(words[i]);
                fos.write("\n");
              }

      }
      fos.close();
      
    }
    
}
