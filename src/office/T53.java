package office;

public class T53 {
}
class Solution53 {
    public int search(int[] nums, int target) {
        int arr = 0;
        for (int i : nums){
            if (i==target)
                arr++;
            if (i>target)
                return arr;
        }
        return arr;
    }
}
