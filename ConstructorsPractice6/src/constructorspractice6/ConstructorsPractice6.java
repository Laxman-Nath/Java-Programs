// Write a java program to create a class Student with suitable properties,methods and constructors.Also create
// a array of objects
package constructorspractice6;
class Student{
   private String rollNo;
   private String name;
   private String dept;
   private String subjects[]=new String[2];
   
   public Student(String r,String n,String d,String s[]){
       rollNo=r;
       name=n;
       dept=d;
       setSubjects(s);
   }
   public String getRoll(){
       return rollNo;
   }
   public String getName(){
       return name;
   }
   public String getdept(){
       return dept;
   }
   public String[] getSubjects(){
      return subjects;
   }
       
      public void setSubjects(String ... s){

       for(int i=0,j=0;i<s.length;i++,j++){
           subjects[j]=s[i];
       }
   }
      
      public String toString(){
          return "\nRoll no:"+rollNo+"\n Name:"+name+"\nDepartment:"+dept;
                  }
   
   
}

public class ConstructorsPractice6 {

   
    public static void main(String[] args) {
       Student s[]=new Student[2];
       String s1[]={"a","b"};
       s[0]=new Student("1e2","b","c",s1);
       System.out.println(s[0]);
       for(String x:s[0].getSubjects())
       {
       
        System.out.println(x);
       }
       
    }
    
}
