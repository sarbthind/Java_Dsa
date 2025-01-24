import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        System.out.println("Enter a year");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year>0){

            if(year%4==0){
                if(year%100!=0||year%400==0){
                    System.out.println("leap year");
                }
                else{
                    System.out.println("not a leap year");
                }
            }
            else{
                System.out.println("not a leap year");
            }
        }
        else{
            System.out.println("entered value of year is invalid");
        }
        sc.close();
    }
}
