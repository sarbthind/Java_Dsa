import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class generateuniquepermutationwithduplicates {
    public static void permute(int[] arr,boolean[] visited,List<Integer> current,List<List<Integer>> result){
        if(current.size()==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(visited[i]) continue;
            if(i>0&&arr[i]==arr[i-1]&&!visited[i-1]) continue;
            visited[i]=true;
            current.add(arr[i]);
            permute(arr, visited, current, result);
            current.remove(current.size()-1);
            visited[i]=false;
        }
    }
    public static void main(String[] args) {
         int[] arr = {1, 1, 2};
        Arrays.sort(arr); // Important for duplicate check
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];

        permute(arr, visited, new ArrayList<>(), result);

        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
