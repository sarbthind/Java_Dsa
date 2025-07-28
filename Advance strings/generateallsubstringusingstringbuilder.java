public class generateallsubstringusingstringbuilder {
    public static void generatesubs(String s,int index,StringBuilder current){
        if(index==s.length()){
            System.out.println(current.toString());
            return;
        }
        current.append(s.charAt(index));
        generatesubs(s, index+1, current);
        current.deleteCharAt(current.length()-1);
        generatesubs(s, index+1, current);

    }
    public static void main(String[] args) {
        String s="abc";
        StringBuilder current=new StringBuilder();
        generatesubs(s,0,current);
    }
}
