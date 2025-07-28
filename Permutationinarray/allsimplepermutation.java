import java.util.*;

public class allsimplepermutation {
    public static void allpermutation(int n,List<String> ans,StringBuilder current,boolean[] visited){
        if(current.length()==n){
            ans.add(current.toString());
            return;
        }
        for(int i=1;i<=n;i++){
            if(!visited[i]){
                visited[i]=true;
                current.append(i);
                allpermutation(n, ans, current, visited);
                current.deleteCharAt(current.length()-1);
                visited[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int n=3;
       // int k=2;
        List<String> ans=new ArrayList<>();
        StringBuilder current=new StringBuilder();
        boolean[] visited=new boolean[n+1];
        allpermutation(n,ans,current,visited);
        for(String str:ans){
            System.out.println(str);
        }
        

    }
}
