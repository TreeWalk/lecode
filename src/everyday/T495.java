package everyday;

public class T495 {
}
class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 1 )
            return duration;
        int res = duration;
        timeSeries[0] = timeSeries[0]+duration;
        for(int i = 1;i<timeSeries.length;i++){
            int a = timeSeries[i]<timeSeries[i-1] ? timeSeries[i-1]-timeSeries[i]+duration:duration;
            timeSeries[i] = timeSeries[i]+duration;
            res+=a;
        }
        return res;
    }
}
