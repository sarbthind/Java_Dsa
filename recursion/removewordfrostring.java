
import java.util.*;
class removewordfrostring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        skip("",str);
    }
    static void skip(String ans,String orig){
        if(orig.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch=orig.charAt(0);
        if(ch=='a'){
            skip(ans,orig.substring(1));
        }
        else{
            skip(ans+ch,orig.substring(1));

        }
    }
}