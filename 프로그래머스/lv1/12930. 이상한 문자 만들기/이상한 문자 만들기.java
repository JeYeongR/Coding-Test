class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();

        int idx = 1;
        for (char c : chars) {
            if (!Character.isAlphabetic(c)) {
                idx = 1;
                answer += c;
                continue;
            }

            if (idx % 2 != 0) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
            
            idx++;
        }

        return answer;
    }
}