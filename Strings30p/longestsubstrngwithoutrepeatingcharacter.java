import java.util.*;
public class longestsubstrngwithoutrepeatingcharacter {
    public static void main(String[] args) {
        String str="abcabbcc";
        int s=0;
        int e=0;
        int maxlength=0;
        List<Character> l=new ArrayList<>();
        while(e<str.length()){
            if(!l.contains(str.charAt(e))){
                l.add(str.charAt(e));
                e++;
                maxlength=Math.max(maxlength,l.size());
            }
            else{
                l.remove(Character.valueOf(str.charAt(s)));
                s++;
                // agar appa sedha remove likhege and character.valueof nhi like ge to ye ascii value lega or out of bound chla jayega

            }
        }
        System.out.println(maxlength);
    }
}
