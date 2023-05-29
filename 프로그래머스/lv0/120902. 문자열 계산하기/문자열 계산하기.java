class Solution {
    public int solution(String my_string) {
        String[] strs = my_string.split(" ");
        int answer = Integer.parseInt(strs[0]);

        for (int i = 1; i < strs.length; i += 2) {
            if (strs[i].equals("+")) {
                answer += Integer.parseInt(strs[i+1]);
            } else {
                answer -= Integer.parseInt(strs[i+1]);
            }
        }

        return answer;
    }
}