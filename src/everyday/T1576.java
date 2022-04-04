package everyday;

public class T1576 {
}
class Solution1576 {
    public String modifyString(String s) {
        int n= s.length();
        char[] sb = s.toCharArray();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='?'){
                char a='a';
                while((i>0&&sb[i-1]==a)||(i<n-1&&sb[i+1]==a)){
                    a++;
                }
                sb[i]=a;
            }
        }
        return new String(sb);
    }
}