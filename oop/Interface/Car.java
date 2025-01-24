public class Car implements Brake,engine{
    @Override
    public void breaks(){
        System.out.println("hi i am from break");
    }
    @Override
    public void engine(){
        System.out.println("hi i am from engine");
    }
}