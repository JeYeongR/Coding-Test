import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = "" + n;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = String.valueOf(chars);
        StringBuilder builder = new StringBuilder(s);
        s = builder.reverse().toString();

        return Long.parseLong(s);
    }
}