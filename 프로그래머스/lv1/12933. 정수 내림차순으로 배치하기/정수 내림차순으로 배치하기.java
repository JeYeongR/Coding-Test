import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = "" + n;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder builder = new StringBuilder(String.valueOf(chars));

        return Long.parseLong(builder.reverse().toString());
    }
}