import java.util.ArrayList;
import java.util.List;

public class generateallpermutation {
    public static  void permute(int[] arr,boolean[] visited,List<Integer> current,List<List<Integer>> result){
            if(current.size()==arr.length){
                result.add(new ArrayList<>(current));
                return;
            }
            for(int i=0;i<arr.length;i++){
                if(!visited[i]){
                    visited[i]=true;
                    current.add(arr[i]);
                    permute(arr, visited, current, result);
                    current.remove(current.size()-1);
                    visited[i]=false;
                }
            }

    }
    //  O(n!) total permutations
    //  Each permutation takes O(n) to build
    public static void main(String[] args) {
          int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        permute(arr, visited, new ArrayList<>(), result);

        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }
}
