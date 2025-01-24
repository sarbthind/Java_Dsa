public class allPermutationofString{
    public static void printpermute(String str,String temp){
        if(str.equals("")){
            System.out.println(temp);
            return;
        }
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        String left=str.substring(0, i);
        String right=str.substring(i+1);
        String rem=left+right;
        printpermute(rem,temp+ch);
    }
    }
    public static void main(String[] args) {
        String str="abc";
        printpermute(str,"");
    }
    // TC-> n*(n-1)*(n-2)---------1;
    // =n!/(n-1)!==O(n!);
}