class Solution {
    public String solution(int[] food) {
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += i;
            }
        }

        String reverseAnswer = new StringBuilder(answer).reverse().toString();
        answer += 0;
        answer += reverseAnswer;

        return answer;
    }
}