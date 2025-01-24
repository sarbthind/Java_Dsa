package multiDarray;
import java.util.Scanner;
public class goodpair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=gooodpair(arr,n);
        System.out.println(ans);
        sc.close();
       
    }
    public static int gooodpair(int[] arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
        }
    
    }

