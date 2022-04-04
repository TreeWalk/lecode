package everyday;

import java.util.Arrays;

//T268
public class Dec_6 {

}
class Solution268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums[0]==1 ? 0:1;
        }
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=i)
                return i;
        }
        return n;
    }
    public int missingNumber1(int[] nums) {
        int n = nums.length,ans = 0,ans1 = 0;
        for (int i=0;i<nums.length;i++){
            ans+=i;
            ans1+=nums[i];
        }
        return ans==ans1 ? n:ans1-ans;
    }
}


