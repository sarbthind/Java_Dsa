import java.util.Scanner;
import java.util.Arrays;
public class basicarray {
    public static void main(String[] args) {
        int[] arr=new int [5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        System.out.println(j);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                temp[j]=arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
        sc.close();
        
        
    }
}
