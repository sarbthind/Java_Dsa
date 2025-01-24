import java.util.Scanner;

public class ratinamazeproblem5 {
    public static void Maze(int rs,int cs,int re,int ce,int[][] maze,String str,boolean[][] isvisited){
        if(rs<0||cs<0) return;
        
        if(rs>re||cs>ce) return;

        if(rs==re&&cs==ce){
            System.out.println(str);
            return;
        }
        if(maze[rs][cs]==0) return;
        if(isvisited[rs][cs]==true) return;
    
           isvisited[rs][cs]=true;
           //down
        Maze(rs+1, cs, re, ce, maze, str+"D",isvisited);
        //right
        Maze(rs, cs+1, re, ce, maze, str+"R",isvisited);
        //up
        Maze(rs-1, cs, re, ce, maze, str+"U", isvisited);
        //left
        Maze(rs, cs-1, re, ce, maze, str+"L", isvisited);

        isvisited[rs][cs]=false;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        
        int row=4;
        int column=6;
        int[][] maze={{1,0,1,1,1,1},
                       {1,1,1,1,0,1},
                       {0,1,1,1,1,1},
                       {0,0,1,0,1,1}
                                   };
     
        boolean[][] isvisited=new boolean[row][column];
        Maze(0,0,row-1,column-1,maze,"",isvisited);
    }
}
