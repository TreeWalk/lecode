package everyday;

public class T2038 {
}
class Solution2038 {
    public boolean winnerOfGame(String colors) {
        int a=0;
        int b=0;
        char[] chars =colors.toCharArray();
        for (int i =1;i<=chars.length;i++){
            if (chars[i]=='A'&&chars[i-1]=='A'&&chars[i+1]=='A')a++;
            if (chars[i]=='B'&&chars[i-1]=='B'&&chars[i+1]=='B')b++;
        }
        return a>b;
    }
}
