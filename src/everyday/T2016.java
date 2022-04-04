package everyday;

public class T2016 {
}
class Solution2016 {
    public int maximumDifference(int[] nums) {
        int ans = -1,len=nums.length;
        for (int i = 1,min= nums[0];i<len;i++){
                if (min<nums[i]){
                   ans = Math.max(ans,nums[i]-min);
                }
            min = Math.min(min,nums[i]);

        }
        return ans;
    }
}