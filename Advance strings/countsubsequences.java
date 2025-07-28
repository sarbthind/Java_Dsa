public class countsubsequences {
    public static int count(String str,int index,String current){
        if(index==str.length()){
            return 1;
        }
        int take=count(str, index+1, current+str.charAt(index));
        int nottake=count(str, index+1, current);
        return take + nottake;
    }
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(count(s,0,""));
    }
}
