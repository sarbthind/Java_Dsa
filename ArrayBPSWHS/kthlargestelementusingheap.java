import java.util.PriorityQueue;

public class kthlargestelementusingheap {
    public static int findklargest(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5};
        int k=3;
        // works weel with repeating values also 
        // Time: O(n log k)
        // Space: O(k)
       int ans= findklargest(arr,k);
       System.out.println(ans);
    }
}
