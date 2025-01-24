import java.util.Arrays;
import java.util.*;

public class OXproblem {
    public static class pair{
        int row;
        int col;
        pair(int i,int j){
            this.row=i;
            this.col=j;
        }
    }
public static char[][] solveproblem(char[][] board){
    if(board==null||board.length==0) return board;
    int rows=board.length;
    int cols=board[0].length;
    Queue<pair> q=new LinkedList<>();
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
        if(board[0][i]=='O'){
            board[0][i]='*';
            q.offer(new pair(0,i));
        }
        if(board[rows-1][i]=='O'){
            board[rows-1][i]='*';
            q.offer(new pair(rows-1, i));
        }
    }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
        if(board[i][0]=='O'){
            board[i][0]='*';
            q.offer(new pair(i,0));
        }
        if(board[i][cols-1]=='O'){
            board[i][cols-1]='*';
            q.offer(new pair(i,cols-1));
        }
    }
    }
    int[][] directions={{1,0},{0,1},{-1,0},{0,-1}};
    while(!q.isEmpty()){
    pair current=q.poll();
    for(int[] dir:directions){
       int newRows=current.row+dir[0];
       int newCol=current.col+dir[1];
       if(isValid(newRows,newCol,rows,cols)&&board[newRows][newCol]=='O'){
        board[newRows][newCol]='*';
        q.offer(new pair(newRows, newCol));

       }
    }

}
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }
            if(board[i][j]=='*'){
                board[i][j]='O';
            }
        }
    }
    return board;

}
public static boolean isValid(int row,int col,int rows,int cols){
    return row>=0&&row<rows&&col<cols&&col>=0;
}
    public static void main(String[] args){
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'O'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'O', 'X'}
        };
        char[][] result=solveproblem(board);
        for(char[] i:result){
            System.out.println(Arrays.toString(i));
        }
    }
}
