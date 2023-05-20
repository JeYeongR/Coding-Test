class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        
        for(int i=0; i<length; i++) {
            answer[i] = num_list[length - i - 1];
        }
        
        return answer;
    }
}