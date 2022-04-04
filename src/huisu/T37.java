package huisu;

public class T37 {
    public static void main(String[] args) {

    }
}
class Solution37 {
    public void solveSudoku(char[][] board) {
        backtracking(board);
    }
    boolean backtracking(char[][] board) {
        for (int i =0;i<9;i++){
            for (int j = 0;j<9;i++){
                if (board[i][j]=='.')continue;
                for (char n = '1';n<='9';n++){
                    if (isval(n,i,j,board)) {
                        board[i][j] = n;
                            if (backtracking(board))
                                return true;
                            board[i][j] = '.';

                    }
                }
                return false;
            }
        }
        return true;
    }
    boolean isval(char n,int row,int col, char[][] board){
        //行列比较
        for (int i = 0;i<9;i++){
            if (board[row][i]== n)
                return false;
            if (board[i][col]== n)
                return false;
        }
        //九宫格比较
        int a = (row/3)*3,b=(col/3)*3;
        for (int i = a;i<a+3;i++){
            for (int j = b;j<b+3;j++){
                if (board[i][j] == n)
                    return false;
            }
        }
        return true;
    }
}

