class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = ((total * 2)/num - num + 1)/2;
        
        for(int i=0; i<num; i++) {
            answer[i] = i + start;
        }

        return answer;
    }
}