package everyday;

public class Oct_23 {
    public static void main(String[] args) {
        Solution23 s = new Solution23();
        int[] n = s.constructRectangle(1000);
        for (int i : n){
            System.out.println(i);
        }
    }
}
class Solution23 {
    public int[] constructRectangle(int area) {
        int[] n = new int[2];
        n[0] = area;
        n[1] = 1;
        int c = area-1;
        for(int i = 2;i<=area/2;i++){
            if(area%i==0){
                int c1 = area/i;
                if (c1-i >=0 && c1-i<c){
                    c =c1-i;
                    n[0] = c1;
                    n[1] = i;
                }
            }
        }
        return n;
    }
}