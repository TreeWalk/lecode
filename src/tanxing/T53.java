package tanxing;

public class T53 {
    public static void main(String[] args) {
        Solution53 s = new Solution53();
        int[] n = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(n));
    }
}
class Solution53 {
    public int maxSubArray(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int max = nums[0];
        int n = 1;
        while(n<nums.length) {
            nums[n] = (nums[n] + nums[n - 1]) > nums[n] ? nums[n] + nums[n - 1] : nums[n];
            if (nums[n] > max) {
                max = nums[n];
            }
            n++;
        }
        return max;
    }
}