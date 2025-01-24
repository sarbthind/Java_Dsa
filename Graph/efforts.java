import java.util.Arrays;
import java.util.*;

public class efforts {
    public static class pair{
        int row;
        int col;
        pair(int row ,int col){
            this.row=row;
            this.col=col;
        }
    }
    public static char[][] solveproblem(char[][] board){
        int rows=board.length;
        int cols=board[0].length;
        Queue<pair> q=new LinkedList<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[0][i]=='O'){
                    board[0][i]='*';
                    q.offer(new pair(0, i));
                }
                else if(board[rows-1][i]=='O'){
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
                else if(board[i][cols-1]=='O'){
                    board[i][cols-1]='*';
                    q.offer(new pair(i, cols-1));
                }
            }
        }
        int directions[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            pair current=q.poll();
        for(int[] dir:directions){
            int newRow=current.row+dir[0];
            int newCol=current.col+dir[1];
            if(isValid(newRow,newCol,rows,cols)&&board[newRow][newCol]=='O'){
                board[newRow][newCol]='*';
                q.offer(new pair(newRow, newCol));
            }
        }

    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(board[i][j]=='*'){
                board[i][j]='O';
            }
            if(board[i][j]=='O'){
                board[i][j]='X';
            }
        }
    }
    return board;
    
    
}
public static boolean isValid(int row,int col,int rows,int cols){
    return row>=0&&row<rows&&col>=0&&col<cols;
}
    public static void main(String[] args) {
        
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
