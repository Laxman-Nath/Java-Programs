// Write a java program to create a class student with suitable properties and methods
package ooppractice4;

class Student
{
    public int roll;
    public String name;
    public String course;
    public double m1,m2,m3;
   
    public double total(){
        return m1+m2+m3;
    }
    public double average(){
        return total()/3;
    }
    public void grade(){
        if(average()>=60)
        {
            System.out.println("Your grade is A");
        }
     
        else
        {
            System.out.println("Your grade is B");
        }
    }
    public String toString(){
        return "Name:"+name+"\n"+"Roll no:"+roll+"\n"+"Course:"+course;
    }
}
public class OOPPractice4 {

    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Laxman";
        s1.roll=23;
        s1.course="csit";
        s1.m1=70;
        s1.m2=80;
        s1.m3=65;
        System.out.println("Total marks:"+s1.total());
        System.out.println("Average marks:"+s1.average());
       s1.grade();
       System.out.println("The details of student is:\n"+s1);
    }
    
}
