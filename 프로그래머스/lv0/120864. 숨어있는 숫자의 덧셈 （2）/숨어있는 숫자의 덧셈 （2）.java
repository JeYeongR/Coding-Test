class Solution {
     public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split("[a-zA-Z]");
        for (String str : split) {
            answer += str.isEmpty() ? 0 : Integer.parseInt(str);
        }

        return answer;
    }
}