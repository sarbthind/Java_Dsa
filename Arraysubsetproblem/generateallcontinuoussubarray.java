import java.util.ArrayList;
import java.util.*;

public class generateallcontinuoussubarray {
      public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            List<Integer> temp = new ArrayList<>();
            for (int end = start; end < arr.length; end++) {
                temp.add(arr[end]);
                subarrays.add(new ArrayList<>(temp)); // Add a copy
            }
        }

        // Print the list of subarrays
        for (List<Integer> sub : subarrays) {
            System.out.println(sub);
        }
    }
}
