package OOPS;
public class classesinjava{
    public static void main(){
        Student S1=new Student();
        Student S2=new Student(12,"aman");
        // S1.rollno=2258;
        // S1.name="anshik";

        System.out.println(S1.name);
        S1.greeting();
        S1.changename("haleluiya");
        System.out.println(S1.name);
        S1.greeting();

        S2.greeting();
        System.out.println(S2.rollno);

        Student random=new Student(S1);
        random.greeting();

    }
}
class Student{
    int rollno;
    String name;
  
    void greeting(){
        System.out.println("good morning "+this.name);
    }

    void changename(String newname){
        name=newname;
    }
  
    Student(){
        this.rollno=23;
        this.name="sarb";
    }
    Student(int roll,String name){
        this.rollno=roll;
        this.name=name;
    }

    Student(Student other){
        this.rollno=other.rollno;
        this.name=other.name;
    }
}