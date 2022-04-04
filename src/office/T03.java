package office;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T03 {
}
//超时
class Solution3 {
    public int findRepeatNumber(int[] nums) {
        List list = new ArrayList<Integer>();
        for (int i : nums){
            if (list.contains(i)){
                return i;
            }else
                list.add(i);
        }
        return 0;
    }
}
class Solution3_1 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if (nums[i]==nums[i+1])
                return nums[i];
        }
        return -1;
    }
}