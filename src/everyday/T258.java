package everyday;

public class T258 {
}
class Solution258 {
    public int addDigits(int num) {
    while (num>=10){
        int sum = 0;
        while (num>0) {
            sum += num % 10;
            num /= 10;
        }
        num=sum;
    }
    return num;
    }
}