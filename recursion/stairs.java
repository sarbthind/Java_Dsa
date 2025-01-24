package recursion;

import java.util.Scanner;

public class stairs {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=totalsteps(n);
        System.out.println(ans);
        sc.close();
    }
    public static int totalsteps(int n){
        if(n==0)
        return 1;

        if(n==1) return 1;

        if(n==2) return 2;

        int ans=totalsteps(n-1)+totalsteps(n-3);
        System.out.println(ans);
        return ans;
    }
}