import java.util.Arrays;

public class AssignCookie{
    public static int assigncookietomax(int[] g,int[] c,int n,int m){
        int l=0;
        int r=0;
        while(l<n&&r<m){
            if(g[l]<=c[r]){
                l=l+1;
            }
            r=r+1;
        }
        return l;

    }
    public static void main(String[] args) {
        int[] greedy={2,1,5,4,3};
        int[] cookie={1,1,2,4,6,2};
        Arrays.sort(greedy);
        Arrays.sort(cookie);
        int n=greedy.length;
        int m=cookie.length;
        int ans=assigncookietomax(greedy,cookie,n,m);
        System.out.println(ans);
    }
}