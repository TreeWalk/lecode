package 动态规划;

public class T746 {
}

class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==2){
            Math.min(cost[0],cost[1]);
        }
        int dp[] = new int[cost.length+1];
        dp[0] = 0;
        dp[1] = 0;
        for(int i = 2 ;i<dp.length;i++){
            dp[i] = Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
        }
        return dp[cost.length];
    }
}
