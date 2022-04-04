package huisu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class T51 {
    public static void main(String[] args) {

    }
}
class Solution51 {
    List<List<String>> list = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for(char[] c : chessboard){
            Arrays.fill(c,'.');
        }
        dsf(n,0,chessboard);
        return list;
    }
    void dsf(int n ,int i , char[][] chessboard){
        if (i==n){
            list.add(new ArrayList<>(getList(chessboard)));
            return;
        }
        for(int j=0;j<n;j++){
            if(isval(i,j,chessboard,n)){
                chessboard[i][j] = 'Q';
                dsf(n,i+1,chessboard);
                chessboard[i][j] = '.';
            }
        }
    }
    List<String> getList(char[][] chessboard){
        List<String> res = new ArrayList<>();
        for (int i = 0;i<chessboard.length;i++){
            String s = "";
            for(int j= 0;j<chessboard[i].length;j++){
                s+=chessboard[i][j];
            }
            res.add(s);
        }
        return res;
    }
    boolean isval(int i, int j,char[][] chessboard,int n ){
        //列检验
        for(int k = 0;k<i;k++){
            if (chessboard[k][j]=='Q')
                return false;
        }
        //45度
        for(int k = i-1,l=j-1;k>=0&&l>=0;k--,j--){
            if (chessboard[k][l]=='Q')
                return false;
        }
        //135
        for (int k = i-1,l=j+1;k>=0&&l<=n-1;k--,j++){
            if (chessboard[k][l]=='Q')
            return false;
        }
        return true;
    }

}
