import java.util.*;
public class generateallsubsequence{
    public static void generateallsubsequences(int[] arr,int index,List<Integer> l){
        if(index==arr.length){
            System.out.println(l);
            return;
        }
        l.add(arr[index]);
        generateallsubsequences(arr, index+1, l);
        l.remove(l.size()-1);
        generateallsubsequences(arr, index+1, l);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        generateallsubsequences(arr,0,new ArrayList<>());
        sc.close();
    }
}