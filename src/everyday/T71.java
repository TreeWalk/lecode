package everyday;

import java.util.ArrayDeque;
import java.util.Deque;

public class T71 {
}
class Solution71 {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        Deque<String> deque = new ArrayDeque<>();
        for (String name: s){
            if (name.equals("..")){
                if (!deque.isEmpty()){
                    deque.pollLast();
                }
            }else if (name.length()>0&&!name.equals(".")){
                deque.offerLast(name);
            }
        }
        StringBuffer ans = new StringBuffer();
        if (deque.isEmpty()){
            ans.append("/");
        }else {
            while (!deque.isEmpty()){
                ans.append("/");
                ans.append(deque.pollFirst());
            }
        }
        return ans.toString();
    }
}
