import java.util.Map;
import java.util.TreeMap;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Character character : map.keySet()) {
            if (map.get(character)== 1) answer += character;
        }

        return answer;
    }
}