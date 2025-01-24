public class staticblock {
    static int a=10;
    static int b;

    static{
        System.out.println("hi this is from static block ");
        b=a*5;
    }
    public static void main(String[] args) {
        staticblock obj=new staticblock();
        System.out.println(staticblock.a);
        System.out.println(staticblock.b);
    }
}
