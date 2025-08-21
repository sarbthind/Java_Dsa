import java.util.*;

public class mergeinterval {
    public static int[][] merge(int[][] intervals){
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
        // key note Always sort the intervals before checking for merges — it simplifies overlapping logic
        List<int[]> merged=new ArrayList<>();
        int[] current=intervals[0];
        merged.add(current);
        for(int[] interval:intervals){
            int currentend=current[1];
            int nextstart=interval[0];
            int nextend=interval[1];
            if(nextstart<=currentend) current[1]=Math.max(currentend,nextend);
            else{
                current=interval;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);

    }
    public static void main(String[] args) {
          int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
