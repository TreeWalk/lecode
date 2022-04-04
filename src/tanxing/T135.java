package tanxing;
/*
老师想给孩子们分发糖果，有N个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
你需要按照以下要求，帮助老师给这些孩子分发糖果：
每个孩子至少分配到 1 个糖果。
评分更高的孩子必须比他两侧的邻位孩子获得更多的糖果。
那么这样下来，老师至少需要准备多少颗糖果呢？

* */
public class T135 {
    public static void main(String[] args) {

    }
}
class Solution135 {
    public int candy(int[] ratings) {
        int[] sun = new int[ratings.length];
        for(int i = 0;i<sun.length;i++){
            sun[i] =1;
        }

        for(int i = 1; i<ratings.length; i++){
            if (ratings[i-1]<ratings[i]){
                sun[i]++;
            }
        }
        for (int i = ratings.length-2;i>=0;i--){
            if (ratings[i]>ratings[i+1]){
                sun[i] = Math.max(sun[i]+1,sun[i+1]+1);
            }
        }
        int ans = 0;
        for (int i = 0;i<ratings.length;i++){
            ans+=sun[i];
        }
        return ans;
    }
}
