public class palindrome {
    public static void main(String[] args) {
        String str="l";
        StringBuilder temp=new StringBuilder(str);
        temp.reverse();
        if(str.equals(temp.toString())) System.out.println("yee");
    }
}
