package multiDarray;
import java.util.Scanner;

public class input {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int[][] arr=new int[3][3];
    int row,col;
    row=sc.nextInt();
    col=sc.nextInt();
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.println(arr[i][j]);
        }
    }
    sc.close();
   } 
}
