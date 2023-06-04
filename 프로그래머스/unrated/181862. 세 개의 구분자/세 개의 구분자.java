import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] strs = Arrays.stream(myStr.split("a|b|c")).filter(str -> !str.isEmpty()).toArray(String[]::new);
        return strs.length != 0 ? strs : new String[]{"EMPTY"};
    }
}