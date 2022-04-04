package everyday;

public class T1725 {
}
class Solution1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int maxlen = 0;
        int ans = 0;
        for (int i =0;i<rectangles.length;i++){
            int [] list = rectangles[i];
            int len=0;
            if (list[0]<list[1]){
                len = list[0];
            }else
                len=list[1];
            if (len>maxlen){
                maxlen=len;
                ans=1;
            }else if (len==maxlen){
                ans++;
            }
        }
        return ans;
    }
}