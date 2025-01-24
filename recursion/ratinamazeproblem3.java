import java.util.*;
// left right up down backtracking*************************************
public class ratinamazeproblem3 {
    public static void countpathUDRL(int rs,int cs,int re,int ce,boolean[][] isvisited,String str){
        if(rs<0||cs<0) return;
        if(rs>re||cs>ce) return ;
        if(isvisited[rs][cs]==true) return;
        if(rs==re&&cs==ce){
            System.out.println(str);
            return;
        }

        //right
        isvisited[rs][cs]=true;
        countpathUDRL(rs, cs+1, re, ce, isvisited, str+"R");
        //down
        countpathUDRL(rs+1, cs, re, ce, isvisited, str+"D");
        //up
        countpathUDRL(rs-1, cs, re, ce, isvisited, str+"U");
        //left
        countpathUDRL(rs, cs-1, re, ce, isvisited, str+"L");
        isvisited[rs][cs]=false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int row;
        int column;
        row=sc.nextInt();
        column=sc.nextInt();
        boolean[][] isvisited=new boolean[row][column];
        countpathUDRL(0,0,row-1,column-1,isvisited,"");
    }
}
