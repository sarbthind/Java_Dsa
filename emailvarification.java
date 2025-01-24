import java.util.*;
class Main{
public static void validemail(String str) throws Exception{
    if(!str.contains("@")){
        throw new Exception("email not contaninig @");
    }
    if(!str.contains(".")){
        throw new Exception("email not contaninig .");
    }
    int at=str.indexOf("@");
    String afterat=str.substring(at+1);
    if(!afterat.contains("@")){
        throw new Exception("email not contaninig @");
    }
}
public static void main(String[] args) {
    String str;
    Scanner sc=new Scanner (System.in);
    str=sc.nextLine();
    try{
        validemail(str);
        System.out.println("valid");
    }
    catch(Exception e){
        System.out.println("invalid");
    }

}







}
