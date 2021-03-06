package 动态规划;

public class T62 {

}
class Solution62 {
    public int uniquePaths(int m, int n) {
        if (m==1) return 1;
        int dp[] = new int[n];
        for(int i = 0;i<n;i++){
            dp[i] = 1;
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
                dp[j] = dp[j]+dp[j-1];
            }
        }
        return dp[n-1];
    }
}
