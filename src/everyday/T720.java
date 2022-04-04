package everyday;

import com.sun.javafx.font.OpenTypeGlyphMapper;

import java.util.*;

public class T720 {
}
class Solution720 {
    public String longestWord(String[] words) {
        Arrays.sort(words, (a, b) ->  {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return b.compareTo(a);
            }
        });
        String longest = "";
        Set<String> set = new HashSet<String>();
        set.add("");
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (set.contains(word.substring(0, word.length() - 1))) {
                set.add(word);
                longest = word;
            }
        }
        return longest;
    }
}

