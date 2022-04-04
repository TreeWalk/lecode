package everyday;

public class T504 {
}
class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0){
            return "0";
        }
        StringBuffer buffer = new StringBuffer();
        boolean b = num>0 ? true:false;
        int i = Math.abs(num);
        while (i>0){
            i = i%7;
            buffer.append(i);
            i/=7;
        }
        if (!b){
            buffer.append('-');
        }
        return buffer.reverse().toString();
    }
}
