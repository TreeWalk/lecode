package everyday;

public class T2017 {

}
class Solution2107 {
    public long subArrayRanges(int[] nums) {
        int len = nums.length;
        long res = 0;
        for (int i = 0;i<len;i++){
            int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
            for (int j = i;j<len;j++){
                max = Math.max(max,nums[j]);
                min = Math.min(min,nums[j]);
                res+=max-min;
            }
        }
        return res;
    }
}