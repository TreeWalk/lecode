package tanxing;

import javax.crypto.spec.PSource;

public class T45 {
    public static void main(String[] args) {
        Solution45 s = new Solution45();
        int[] nums = {2,3,0,1,4};
        System.out.println(s.jump(nums));
    }


}
class Solution45 {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int [] n = new int[nums.length];
        System.out.println(n.length);
        for (int i = 0;i<nums.length;i++){
            for (int j = 0;j<nums[i];j++) {
                if ( i+1+j < n.length) {
                    if (n[i+1+j] == 0) {
                        n[i+1+j] = n[i] + 1;
                    } else
                        n[i+1+j] = Math.min(n[i+1+j], n[i] + 1);
                }
                if (n[nums.length-1]>0){
                    return n[nums.length-1];
                }
            }
        }
        return n[nums.length-1] ;
    }
}
