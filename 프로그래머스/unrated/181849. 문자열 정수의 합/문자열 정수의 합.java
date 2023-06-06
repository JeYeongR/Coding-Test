class Solution {
    public int solution(String num_str) {
        int answer = 0;

        for (char c : num_str.toCharArray()) answer += c - 48;

        return answer;
    }
}