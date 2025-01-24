package OOPS;

public class staticvariable {

        public static void main(String[] args) { 
    
            Student s1 = new Student(); 
            
            s1.roll = 123; 
            
            s1.name = "Neeraj"; 
            
            // s1.numberOfStudents = 10; 
            
            Student s2 = new Student(); 
            
            s2.roll = 124; 
            
            s2.name = "Alice"; 
            // Student s3=new Student();
            
            System.out.println(Student.numberOfStudents); 
    
        } 
    
    } 


    
    class Student { 
    
        static int numberOfStudents; 
    
        int roll; 
    
        String name; 
    
        Student() { 
    
            numberOfStudents++; 
    
        } 
    
        // static int getNumberOfStudents() { 
    
        //     return numberOfStudents; 
    
        // } 
    
    } 

