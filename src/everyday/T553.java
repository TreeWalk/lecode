package everyday;

public class T553 {
}
class Solution553 {
    public String optimalDivision(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return String.valueOf(nums[0]);
        if (len ==2 )
            return nums[0]+"/"+nums[1];
        StringBuffer sb = new StringBuffer();
        sb.append(nums[0]);
        sb.append("/");
        sb.append("(");
        sb.append(nums[1]);
        for (int i = 2;i<len;i++){
            sb.append("/");
            sb.append(nums[i]);
        }
        sb.append(")");
        return sb.toString();
    }
}