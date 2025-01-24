package arraylist;
import java.util.*;

public class basic2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        
        infiniteloop(arr);

        
    }
    public static void infiniteloop(ArrayList<Integer> arr){
        
        Scanner sc=new Scanner(System.in);
        while (true) {
            Menu();
            int choise=sc.nextInt();
            // adding 
            if(choise==1){
                arr.add(sc.nextInt());
           
            }
            else if (choise==2) {
                System.out.println("Enter the index you want to remove");
                int i=sc.nextInt();
                if(i<arr.size()) {
                    arr.remove(i);
                }
                else{
                    System.out.println("index out of bound");
                }
              
            }
            else if (choise==3) {
                System.out.println("List is : "+ arr);
                      
            }
            else if (choise==4) {
                break;
            }
          
        }
        sc.close();
    }
    public static void Menu(){
        System.out.println();
        System.out.println("1.ADD");
        System.out.println("2.Remove");
        System.out.println("3.Display");
        System.out.println("4.Exit");
    }
        
}
