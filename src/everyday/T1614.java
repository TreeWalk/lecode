package everyday;

import java.util.Stack;

public class T1614 {
}
class Solution1614 {
    public int maxDepth(String s) {
        int n = 0;
        int max = 0;
        char[] list = s.toCharArray();
        for (char c : list){
            if (c=='('){
                n++;
                if (n>max){
                    max = n;
                }
            }else if (c==')'){
                n--;
            }
        }
        return max;
    }
}