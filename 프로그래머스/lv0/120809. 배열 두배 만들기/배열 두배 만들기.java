class Solution {
    public int[] solution(int[] numbers) {
        int length = numbers.length;
        int[] answer = new int[length];
        
        for(int i=0; i<length; i++) {
            answer[i] = numbers[i] * 2;
        }
         
        return answer;
    }
}