class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int length = num2 - num1 + 1;
        int[] answer = new int[length];
        
        for(int i=0; i<length; i++) {
            answer[i] = numbers[i+num1];
        }
        
        return answer;
    }
}