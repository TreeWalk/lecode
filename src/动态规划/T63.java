package 动态规划;

public class T63 {
    public static void main(String[] args) {
        Solution63 s = new Solution63();
        int[][] nums = {{0,0,0},{0,1,0},{0,0,0}};
        int dp[][] = s.uniquePathsWithObstacles(nums);;
        int n = s.dp.length;
        int m = s.dp[0].length;
        for (int i = 0;i<n;i++){
            for (int j = 0;j<m;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class Solution63 {
    int dp[][];
    public int[][] uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
//        if(obstacleGrid[n-2][m-1]==1&&obstacleGrid[n-1][m-2]==1) return 0;
        dp = new int[n][m];
        for(int i = 0;i<m;i++){
            if(obstacleGrid[0][i]!=1){
                dp[0][i] = 1;}
            else dp[0][i] = 0;
        }
        for(int i = 0;i<n;i++){
            if(obstacleGrid[i][0]!=1){
                dp[i][0] = 1;}
            else dp[i][0] = 0;
        }
        for(int i = 1;i < n;i++){
            for (int j = 1;j<m;j++){
                if(obstacleGrid[i][j] != 1){
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }else dp[i][j] = 0;
            }
        }
        return dp;
    }
}
