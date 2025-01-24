package arraylist;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i));
            
        }

         
       

        sc.close();
    }
}
