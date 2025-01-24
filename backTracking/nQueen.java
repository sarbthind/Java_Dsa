import java.util.Arrays;

public class nQueen {
    public static boolean issafe(int col,int row,char[][] board){
        int n=board.length;
        // check col
        for(int i=0;i<row;i++) if(board[i][col]=='Q') return false;

      //  for(int j=0;j<col;j++) if(board[row][j]=='Q') return false;

        // check north east
        int i=row;
        int j=col;
        while(i>=0&&j<n){
            if(board[i][j]=='Q') return false;
                i--;
                j++;
            
        }
        // check SE
        i=row;
        j=col;
        while(i<n&&j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        // check SW
        i=row;
        j=col;
        while(i<n&&j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        // NW
        i=row;
        j=col;
        while(i>=0&&j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }



        return true;
    }
    public static void nqueen(char[][] board,int row){
        int n=board.length;
        if(row==n){
            for(char[] ch:board){
                System.out.println(ch);
            }
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++){
            if(issafe(j,row,board)){
                board[row][j]='Q';
                nqueen(board, row+1);
                board[row][j]='X';
            }
        }

    }
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for(char[] ch:board) Arrays.fill(ch, 'X');
        nqueen(board,0);
    }
}
