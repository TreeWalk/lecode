package huisu;

import java.util.ArrayList;
import java.util.List;

public class T797 {
    public static void main(String[] args) {
    Solution797 s = new Solution797();
    int[][] l = {{4,3,1},{3,2,4},{3},{4},{}};
    List<List<Integer>> list= s.allPathsSourceTarget(l);
    for(int i = 0;i<list.size();i++){
        System.out.print("[");
        for (int j = 0;j<list.get(i).size();j++){
            System.out.print(list.get(i).get(j)+",");
        }
        System.out.println("]");
    }

    }
}
class Solution797 {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    int[][] graph;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph=graph;
        path.add(0);
        backtracking(path,0);
        return list;
    }
    private void backtracking(List<Integer> path,int n){
        if (n==graph.length-1){
            list.add(new ArrayList<>(path));
            return;
        }
        for (int j = 0;j<graph[n].length;j++){
                path.add(graph[n][j]);
                backtracking(path,graph[n][j]);
                path.remove(path.size()-1);
            }
        }

    }

