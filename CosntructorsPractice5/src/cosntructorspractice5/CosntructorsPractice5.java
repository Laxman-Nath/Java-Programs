// Write a java program to create a class Student with suitable properties,methods and constructors
package cosntructorspractice5;
class Subject{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    public String getId(){
        return subID;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks()
    {
        return maxMarks;
    }
    public int getMarksObtain(){
        return marksObtain;
    }
    public void setmaxMarks(int mm){
        maxMarks=mm;
    }
    public void setmarksObtain(int m){
        marksObtain=m;
    }
    public Subject(String sid,String nam){
        subID=sid;
        name=nam;
    }
    public Subject(String sid,String nam,int m1,int m2){
        subID=sid;
        name=nam;
        maxMarks=m1;
        marksObtain=m2;
    }
   public boolean isQualified(int m){
        return marksObtain>=maxMarks/10*4;
}
   public String toString(){
       return "\n SubjectID:"+subID+"\nName:"+name+"\nMaximum marks:"+maxMarks+"\n Marks Obtained"+marksObtain;
}
}

public class CosntructorsPractice5 {

 
    public static void main(String[] args) {
        Subject s[]=new Subject[3];
        s[0]=new Subject("12jjs","laxman");
        s[1]=new Subject("1kd","bikash",23,78);
        s[2]=new Subject("22jjkk","harish",78,99);
        for(Subject s1:s){
        System.out.println(s1);
        }
    }
    
}
