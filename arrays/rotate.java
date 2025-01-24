import java.util.Scanner;
import java.util.Arrays;
public class rotate {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value from you want to rotate");
        int d=sc.nextInt();
        int[] temp=new int[arr.length];
        int j=0;
        for(int i=d;i<arr.length;i++){
            temp[j]=arr[i];
            j++;
        }
        for(int i=0;i<d;i++){
            temp[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(temp));
        sc.close();
        
    }
}
