package everyday;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

//T1218
public class Dec_5 {
    public static void main(String[] args) {

        System.out.println("T5");

    }
}
class Solution1218 {
    public int longestSubsequence(int[] arr, int difference) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int[][] dp = new int[n][2];
        dp[0][1] =1;
        map.put(arr[0],0);
        for (int i = 1;i<arr.length;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = 1;
            int prev  = arr[i]-difference;
            if (map.containsKey(prev)) dp[i][1] = Math.max(dp[i][1],dp[prev][1]+1);
            map.put(arr[i],i);
        }
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
}