import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeCharArray = before.toCharArray();
        char[] afterCharArray = after.toCharArray();

        Arrays.sort(beforeCharArray);
        Arrays.sort(afterCharArray);
        
        return Arrays.toString(beforeCharArray).equals(Arrays.toString(afterCharArray)) ? 1 : 0;
    }
}