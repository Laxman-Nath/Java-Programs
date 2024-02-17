// Write a java program to remove duplicate character from a string
package stringpractice13.java;

public class StringPractice13Java {

    public static void main(String[] args) {
        String str="JaJav";
        // First approach using java 8 mechanism
//        StringBuilder sb=new StringBuilder();
//        str.chars().distinct().forEach(c ->sb.append((char)c));
//        System.out.println(sb);

   // Approach 2
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            int index=str.indexOf(ch,i+1);
//            if(index==-1){
//                sb.append(ch);
//            }
//        }
//        System.out.println(sb);

    // Approach 3
    char A[]=str.toCharArray();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<A.length-1;i++){
         boolean repeated=false;
        for(int j=i+1;j<A.length-1;j++){
            if(A[i]==A[j]){
                repeated=true;
            }
            }
        if(!repeated){
                 sb.append(A[i]);
            }
       
    }
     System.out.println(sb);
    }
    
}
