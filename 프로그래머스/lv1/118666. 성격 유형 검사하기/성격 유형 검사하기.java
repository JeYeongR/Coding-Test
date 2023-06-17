import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];

            if (choice > 4) {
                char c = survey[i].charAt(1);
                map.put(c, map.getOrDefault(c, 0) + choice - 4);
            } else if (choice < 4) {
                char c = survey[i].charAt(0);
                map.put(c, map.getOrDefault(c, 0) + 4 - choice);
            }
        }

        answer += map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T';
        answer += map.getOrDefault('C',0) >= map.getOrDefault('F',0) ? 'C' : 'F';
        answer += map.getOrDefault('J',0) >= map.getOrDefault('M',0) ? 'J' : 'M';
        answer += map.getOrDefault('A',0) >= map.getOrDefault('N',0) ? 'A' : 'N';

        return answer;
    }
}