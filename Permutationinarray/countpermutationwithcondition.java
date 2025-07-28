import java.util.ArrayList;
import java.util.List;


// condition is arr[i]<arr[i+1];
public class countpermutationwithcondition {
    public static int count=0;
    public static boolean istrue(List<Integer> current){
        //int ans=0;
        for(int i=1;i<current.size();i++){
            if(current.get(i-1)<current.get(i)) return false;
        }

        // for(int i=1;i<current.size();i++){
        //     if(current.get(i-1)<current.get(i)) ans++;
        // }
        return true;
        // if(ans>0) return true;
        // else return false;
    }
    public static void permute(int[] arr,boolean[] visited,List<Integer> current,List<List<Integer>> result){
        if(current.size()==arr.length){
            if(istrue(current)){
                count++;
                result.add(new ArrayList<>(current));
            }
            return ;
        }
        for(int i=0;i<arr.length;i++){
            // if we have duplicates then we have to do also this that is i am doing in coments
            // if(visited[i]) continue;
            // if(i>0&&arr[i]==arrr[i-1]&&!visited[i-1]) continue;
                // visited[i]=true;
                // current.add(arr[i]);
                // permute(arr, visited, current, result);
                // current.remove(current.size()-1);
                // visited[i]=false;
                if(!visited[i]){
                    visited[i]=true;
                    current.add(arr[i]);
                    permute(arr, visited, current, result);
                    current.remove(current.size()-1);
                    visited[i]=false;
                }
        }
    }
    public static void main(String[] args) {
           int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        permute(arr, visited, new ArrayList<>(), result);

        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
        System.out.println(count);
    }
}
