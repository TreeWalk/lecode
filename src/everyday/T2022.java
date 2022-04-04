package everyday;

public class T2022 {
}
class Solution2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length!=m*n){
            return null;
        }
        int indsx  = 0;
        int[][] ans = new int[m][n];
        for (int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                ans[i][j] = original[indsx++];
            }
        }

        return ans;
    }
}