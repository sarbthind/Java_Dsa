import java.util.*;
public class stringsubset {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        subset("",str);
    }
    static void subset(String ans,String orig){
        if(orig.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch=orig.charAt(0);
       
            subset(ans,orig.substring(1));
       
            subset(ans+ch,orig.substring(1));

        
    }
}

