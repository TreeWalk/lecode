package everyday;

import java.util.ArrayList;
import java.util.List;

public class T438 {
    public static void main(String[] args) {
        String s = "abab";
        String q = "ab";
        Solution438 t438 = new Solution438();
        List<Integer> list = t438.findAnagrams(s,q);
        for (int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        int n = p.length();
        List<Integer> list = new ArrayList<>();
        char[] c = p.toCharArray();
        for (int i = 0; i <= s.length() - n; i++) {
            List<Character> l1 = new ArrayList<>();
            for (int j = i; j < i+n; j++) {
                l1.add(s.charAt(j));
            }
            System.out.println("========"+i+"=========");
            for (int k =0;k<l1.size();k++){
                System.out.println(l1.get(k));
            }
            if (isOk(l1, c)) {
                list.add(i);
            }
        }
        return list;
    }

    boolean isOk(List<Character> q, char[] c) {
        for (char a : c) {
            if (!q.contains(a)) {
                return false;
            }
        }
        return true;
    }
}