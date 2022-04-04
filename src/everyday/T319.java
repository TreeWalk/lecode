package everyday;

public class T319 {
    public static void main(String[] args) {
        Solution319 s = new Solution319();
        s.bulbSwitch(10);
        for (int i : s.list){
            System.out.println(i);
        }
    }
}
class Solution319 {
    int[]  list ;
    public int bulbSwitch(int n) {
        if(n<=1) return n;
        list = new int[n];
        int res = 0;
        for (int i = 0;i<list.length;i++){
            if (i%2!=0)
                list[i] = 1;
            else
                list[i] = 0;
        }
        int i = 3;
        while (i<=n){
            for (int j=i;j<list.length;j+=i){
                list[j] = list[j]== 0 ? 1:0;
            }
            i++;
        }
        for (int j = 0;j<list.length;j++){
            if (list[j]==1)
                res++;
        }
        return res;
    }
}

