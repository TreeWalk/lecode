package everyday;

import java.util.Arrays;

public class T825 {
}

class Solution825 {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int ans = 0;
        int n = ages.length;
        for (int x = n-1;x>=0;x--){
            for (int y = 0;y<n;y++){
                if(x==y)
                    continue;
                if(ages[y] <= 0.5 * ages[x] + 7)
                    continue;
                if (ages[y] > ages[x])
                    continue;
                if (ages[y] > 100 && ages[x] < 100)
                    continue;
                ans++;
            }
        }
        return ans;
    }
}