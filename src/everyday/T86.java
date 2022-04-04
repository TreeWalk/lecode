package everyday;

import java.util.ArrayList;
import java.util.List;

public class T86 {
}
class Solution86 {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        if (n==1){
            return list;
        }
        for (int i =2;i<=n;i++){
            int l = (int)Math.pow (2, i-1);
            for (int j = l-1; j>=0; j--){
                int k = list.get(j);
                list.add(k+l);
            };
        }
        return list;
    }
}

