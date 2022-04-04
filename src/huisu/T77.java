package huisu;

import java.util.ArrayList;
import java.util.List;

public class T77 {
    public static void main(String[] args) {

    }
}
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return list;
    }
    void backtracking(int n,int k,int star){
        if (path.size()==k){
            list.add(new ArrayList<>(path));
        }
        for (int i = star;i<n;i++){
            path.add(i);
            backtracking(n,k,star+1);
            path.remove(path.size()-1);
        }
    }
}
