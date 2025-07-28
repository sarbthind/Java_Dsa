// import java.util.*;
public class removeduplicatefromstring {
    public static void main(String[] args) {
        
        String s="aaabbbccccdddd";
        StringBuilder str=new StringBuilder();
        boolean[] seen=new boolean[256];
        for(char c:s.toCharArray()){
            if(!seen[c]){
                seen[c]=true;
                str.append(c);
            }
        }
        System.out.println(str.toString());
        // Set<Character> ans=new HashSet<>();
        // for(char c:s.toCharArray()){
        //     if(!ans.contains(c)){
        //         ans.add(c);
        //     }
        // }
        // for(char c:ans){
        //     System.out.print(c);
        // }
    }
}
