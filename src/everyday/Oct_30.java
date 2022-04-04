package everyday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Oct_30 {
    public static void main(String[] args) {
        int [] num = {1,2,1,3,2,5};
        Solution30 o = new Solution30();
        for(int i : o.singleNumber(num)){
            System.out.println(i);
        }
    }
}
class Solution30 {
    List<Integer> list = new ArrayList<>();
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums[0];
        for(int i = 1;i<nums.length;i++){
            if (n!=nums[i]){
                list.add(n);
                n=nums[i];
            }
        }
        int[] num = new int[list.size()];
        for (int i = 0;i<num.length;i++){
            num[i] = list.get(i);
        }
        return num;
    }
}
