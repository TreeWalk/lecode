package everyday;

import java.util.ArrayList;
import java.util.List;

public class T1414 {
}
class Solution1414 {
    public int findMinFibonacciNumbers(int k) {
        int ans = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        int a = 1,b=1;
        while(a+b<=k){
            int c = a+b;
            list.add(c);
            a = b;
            b = c;
        }
        for(int i = list.size()-1;i>=0&&k>0;i--){
            int j = list.get(i);
            if (k>=j){
                k-=j;
            ans++;}
        }
        return ans;
    }
}