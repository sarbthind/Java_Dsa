import java.util.*;
public class toggletebulb {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int testcases=sc.nextInt();
      int bulb;
      int toggle;
      for(int i=0;i<testcases;i++){
        bulb=sc.nextInt();
        toggle=sc.nextInt();
      
      Boolean[] arr=new Boolean[bulb];

      for(int j=0;j<bulb;j++){
        arr[i]=true;
      }

      int m=1;
      for(int k=2;k<=toggle;k++){

        if(m<bulb){

          arr[m]=false;
          m++;
        }
        else{
          m=0;
        }

      }
      int count=0;
      for(Boolean bulbs:arr){
        if(true){
          count++;
        }

        
      }
      System.out.println(count);
    
    }
  }
}
