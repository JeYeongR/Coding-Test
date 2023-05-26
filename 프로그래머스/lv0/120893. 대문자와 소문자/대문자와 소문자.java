class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (char c : my_string.toCharArray()) {
            if (Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            else answer += Character.toLowerCase(c);
        }
        
        return answer;
    }
}