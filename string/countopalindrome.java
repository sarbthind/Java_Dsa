// package string;
import java.util.*;

public class countopalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length-1;i++){
           count= countpalindrome(arr[i])+count;
        }
        System.out.println(count);
        sc.close();
        


    }
    public static int countpalindrome(String str){
        int count=0;
        int s=0;
        int e=str.length()-1;
        boolean flag=false;
        if(str.length()>1){

            while(s<e){
                if(str.toLowerCase().charAt(s++)==str.toLowerCase().charAt(e--)){
                    flag=true;             
            }
        }
    }
        if(flag==true){
            count++;
        }
       return count;
    }
}
