import java.util.*;
public class createallsubstes {
    public static void generateallsubsets(int[] arr,int index,List<Integer> current,List<List<Integer>> result){
        if(index==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        generateallsubsets(arr, index+1, current, result);
        current.remove(current.size()-1);
        generateallsubsets(arr, index+1, current, result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        generateallsubsets(arr,0,new ArrayList<>(),result);
        for(List<Integer> subsets:result){
            System.out.println(subsets);
        }
        sc.close();
    }
}
