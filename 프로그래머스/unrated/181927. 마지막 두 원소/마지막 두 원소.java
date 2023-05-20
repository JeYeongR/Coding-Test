class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        int idx = length - 1;

        for (int i = 0; i < length; i++) answer[i] = num_list[i];

        if (num_list[idx - 1] < num_list[idx]) answer[length] = num_list[idx] - num_list[idx - 1];
        else answer[length] = num_list[idx] * 2;
      
        return answer;
    }
}