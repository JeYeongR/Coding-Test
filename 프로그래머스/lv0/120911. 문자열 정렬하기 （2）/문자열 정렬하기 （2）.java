import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        for (char c : chars) {
            answer += c;
        }
        
        return answer;
    }
}