class Solution {
    public int[] solution(int start, int end) {
        int length = end - start + 1;
        int[] answer = new int[length];
        for(int i=0; i<length; i++) {
            answer[i] = i + start;
        }
        
        return answer;
    }
}