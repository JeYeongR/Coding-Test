import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String numbers = Integer.toString(n);
        for (int i = 0; i < numbers.length(); i++) {
            answer += Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        return answer;
    }
}