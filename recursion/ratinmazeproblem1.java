import java.util.*;
public class ratinmazeproblem1 {
    static int countways(int rs,int cs,int re,int ce){
        if(rs>re||cs>ce) return 0;

        if(rs==re&&cs==ce) return 1;

        int downway=countways(rs+1,cs,re,ce);
        int rightways=countways(rs, cs+1, re, ce);
        int totalways=downway+rightways;

        return totalways;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row;
        int column;
        row=sc.nextInt();
        column=sc.nextInt();
        System.out.println(countways(1,1,row,column));
    }
}
