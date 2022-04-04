package tanxing;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
T1005K次取反后最大化的数组和
    给定一个整数数组 A，我们只能用以下方法修改该数组：我们选择某个索引i并将A[i]替换为-A[i]，然后总共重复这个过程 K 次。
(我们可以多次选择同一个索引 i。)
    以这种方式修改数组后，返回数组可能的最大和。
*/
public class T1005 {
    public static void main(String[] args) {
        Solution1005 s = new Solution1005();
        int [] A ={-4,-3,-2};
        int K = 4;
        System.out.println(s.largestSumAfterKNegations(A,K));
    }
}
class Solution1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0 ;
        Arrays.sort(nums);
        int i = 0;
        while (k>0){
            if (nums[i]>=0&&i<nums.length){
                if (k%2==0)
                    break;
                }else if (i>=nums.length) {
                    Arrays.sort(nums);
                    nums[i]=-nums[i];
                    k--;
                    i++;
                }
            }
            if(nums[i]<0){
                k--;
                nums[i]=-nums[i];
                i++;
            }
        for (int j : nums){
            sum += j;
        }
        return sum;
    }
}
class t1 {
    public int largestSumAfterKNegations(int[] A, int K) {
        if (A.length == 1) return K % 2 == 0 ? A[0] : -A[0];
        Arrays.sort(A);
        int sum = 0;
        int idx = 0;
        for (int i = 0; i < K; i++) {
            if (i < A.length - 1 && A[idx] < 0) {
                A[idx] = -A[idx];
                if (A[idx] >= Math.abs(A[idx + 1])) idx++;
                continue;
            }
            A[idx] = -A[idx];
        }

        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return sum;
    }
}