// place k nights such thatthey donot attack each other
// how many knights i can place in a n*n grid
import java.util.*;
public class Knights {
    static int maxKnights=-1;
    static int number=8;
    public static boolean issafe(int col,int row,char[][] board){
        int n=board.length;
        int i=row-2;
        int j=col+1;
        if(i>=0&&j<n&&board[i][j]=='K') return false;
        // 2up 1 left
         i=row-2;
         j=col-1;
        if(i>=0&&j>=0&&board[i][j]=='K') return false;
        // 2down 1 left
        i=row+2;
        j=col-1;
       if(i<n&&j>=0&&board[i][j]=='K') return false;
    //    2 down 1 right
         i=row+2;
         j=col+1;
        if(i<n&&j<n&&board[i][j]=='K') return false;
        // 2 right 1 up
        i=row-1;
        j=col+2;
       if(j<n&&i>=0&&board[i][j]=='K') return false;
    //    2 right 1 down
        i=row+1;
        j=col+2;
      if(i<n&&j<n&&board[i][j]=='K') return false;
    //   2 left 1 up
        i=row+1;
        j=col-2;
        if(i<n&&j>=0&&board[i][j]=='K') return false;
    //   2 left 1 down
        i=row-1;
        j=col-2;
        if(i>=0&&j>=0&&board[i][j]=='K') return false;

        return true;

    }
    public static void Knight(char[][] board,int row,int col,int num){
        int n=board.length;
        if(row==n){
            if(num==number) {
               maxKnights=Math.max(maxKnights, num);
                for(char[] ch:board) System.out.println(ch);
                System.out.println();
                System.out.println(maxKnights);
            }
            return;
        }
       
        else if(issafe(col,row,board)){
            board[row][col]='K';
            if(col!=n-1){
                Knight(board, row, col+1, num+1);
            }
            else Knight(board, row+1, 0, num+1);
            board[row][col]='X';
        }

        if(col!=n-1) Knight(board, row, col+1, num);
        else Knight(board, row+1, 0, num);

        
    }
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for(char[] ch:board) Arrays.fill(ch,'X');
        Knight(board,0,0,0);
    }
}
