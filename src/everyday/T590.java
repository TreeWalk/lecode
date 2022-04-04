package everyday;

import java.util.*;
public class T590 {
}

class Solution590 {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(Node root,List<Integer> res){
        if (root==null){
            return;
        }
        for (Node n : root.children){
            helper(n,res);
        }
        res.add(root.val);
    }
}