package everyday;

public class T2044 {
}
class Solution2044 {
    int [] nums;
    int max,n;
    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;
        n=0;
        backtracking(0,0);
        return n;
    }
    void backtracking(int val,int i){
        if (i==nums.length){
            if (max<val){
                max = val;
                n=1;
            }else if (max == val){
                n++;
            }
            return;
        }
        backtracking(val|nums[i],i++);
        backtracking(val,i++);
    }
}
