import java.util.Scanner;
// without backtracking*************************************
public class ratinamazeproblem2 {
    static void printpath(int rs,int cs,int re,int ce,String str){
        if(rs>re||cs>ce) return;

        if(rs==re&&cs==ce){
            System.out.println(str);
            return;
        }

        printpath(rs+1, cs, re, ce, str+"D");
        printpath(rs, cs+1, re, ce, str+"R");
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int row;
        int column;
        row=sc.nextInt();
        column=sc.nextInt();
        printpath(1,1,row,column,"");
    }
}
