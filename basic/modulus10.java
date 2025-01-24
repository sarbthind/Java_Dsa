import java.util.*;
public class modulus10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n>1000&&n<9999){

            int m=n;
            int count=0;
            while (m!=0) {
                count++;
                m/=10;
            }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<count;i++){
            int rem=n%10;
            if(rem+1==10){
                arr.add(0,0);
            }
            else{
                arr.add(0,rem+1);
            }
            n/=10;
        }
        // System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
        
    }
    sc.close();
    
    }
}
