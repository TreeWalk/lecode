package everyday;

import java.util.*;
public class T2100 {

}
class Solution2100 {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int len = security.length;
        int[] left = new int[len];
        int[] right = new int[len];
        for (int i = 1;i<len;i++){
            if (security[i]>=security[i-1]){
                left[i] = left[i-1]+1;
            }
            if(security[len-1-i]<=security[len-i]){
                right[len-i-1]=right[len-i]+1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = time ;i < len-time;i++){
            if (left[i]>=time&&right[i]>=time){
                list.add(i);
            }
        }
        return list;
    }
}