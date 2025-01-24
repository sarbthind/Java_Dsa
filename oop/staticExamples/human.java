package oop.staticExamples;

public class human {
    int age;
    String name;
    long salary;
    boolean married;
    static long population;

    human(int age,String name,long salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        human.population=10000;
    }
}
