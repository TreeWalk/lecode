package everyday;

public class T2055 {
}
class Solution2055 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] presum = new int[n];
        for (int i =0,sum=0;i<n;i++){
            if (s.charAt(i)=='*')
                sum++;
            presum[i] = sum;
        }
        int[] left = new int[n];
        for (int i = 0 ,l=-1;i<n;i++){
            if(s.charAt(i)=='|')
                l=i;
            left[i]=l;
        }
        int[] right = new int[n];
        for (int i = n-1 ,r=-1;i>=0;i--){
            if(s.charAt(i)=='|')
                r=i;
            right[i]=r;
        }
        int[] ans = new int[queries.length];
        for (int i = 0;i<queries.length;i++){
            int [] querie = queries[i];
            int x = right[querie[0]],y=left[querie[1]];
            ans[i] = x == -1||y==-1||x>=y ? 0:presum[y]-presum[x];
        }
        return ans;
    }
}
