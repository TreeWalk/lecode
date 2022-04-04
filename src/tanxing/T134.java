package tanxing;

/*
加油站
在一条环路上有N个加油站，其中第i个加油站有汽油gas[i]升。
你有一辆油箱容量无限的的汽车，从第i个加油站开往第 i+1个加油站需要消耗汽油cost[i]升。
你从其中的一个加油站出发，开始时油箱为空。
如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1。
输入:
gas  = [1,2,3,4,5]
cost = [3,4,5,1,2]
输出: 3
* */
public class T134 {
    public static void main(String[] args) {
        int[] a ={2,3,4};
        int[] b ={3,4,3};
        Solution134 s = new Solution134();
        System.out.println(s.canCompleteCircuit(a,b));
    }
}
class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int ssun = 0;
        int sun = 0;
        int star = 0;
        for (int i = 0;i<n;i++){
                ssun += gas[i]-cost[i];
                sun += gas[i]-cost[i];
                if (ssun<0){
                    ssun = 0;
                    star = (i+1)%n;
                }

            }
        if (sun<0){
            return -1;
        }
        return star;
    }
}
