class Solution {
    public String solution(int age) {
        String answer = "";

        String[] strs = String.valueOf(age).split("");

        for (String str : strs) {
            answer += (char) (Integer.parseInt(str) + 97);
        }
        
        return answer;
    }
}