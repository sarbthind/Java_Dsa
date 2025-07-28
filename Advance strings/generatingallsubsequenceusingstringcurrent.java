public class generatingallsubsequenceusingstringcurrent {
    public static void generatesub(String s,int index, String current){
        if(index==s.length()){
            System.out.println(current);
            return;
        }
        generatesub(s, index+1, current);//nottake
        generatesub(s, index+1, current+s.charAt(index));//take
    }
    public static void main(String[] args) {
        String s="abc";
        generatesub(s,0,"");
    }
}
