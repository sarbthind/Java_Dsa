package oop.staticExamples;

public class Main {
    public static void main(String[] args) {
        
        human kunal=new human(12,"kunall",120000,false);
        human rahul=new human(14,"rahul",52000,true);

        System.out.println(kunal.name);
        System.out.println(rahul.name);

        System.out.println(kunal.population);
        System.out.println(rahul.population);

        System.out.println(kunal.salary);
    }

    
}
