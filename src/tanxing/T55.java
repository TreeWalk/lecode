package tanxing;

public class T55 {
    public static void main(String[] args) {
        Solution55 s = new Solution55();
        int[] a = {2,3,1,1,4};
        System.out.println(s.canJump(a));
    }
}
class Solution55 {
    public boolean canJump(int[] nums) {
        if (nums.length==1){
            return true;
        }
        int cover = nums[0];
        for (int i = 0;i<=cover;i++){
            cover = Math.max(cover,nums[i]+i);
            if (cover>=nums.length-1)
                return true;
        }
        return false;
    }
}