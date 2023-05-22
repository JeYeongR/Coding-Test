import java.util.*;

class Solution {
     public String solution(String letter) {
        String answer = "";
        String[] mose = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Map<String, Character> map = new HashMap<>();

        for (int i = 0; i < mose.length; i++) {
            map.put(mose[i], (char) (97 + i));
        }

        String[] letters = letter.split(" ");

        for (String s : letters) {
            if (map.containsKey(s)) {
                answer += map.get(s);
            }
        }

        return answer;
    }
}