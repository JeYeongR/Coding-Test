import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] strs = myString.split("x");

        return Arrays.stream(strs).filter(str -> !str.isEmpty()).sorted().toArray(String[]::new);
    }
}