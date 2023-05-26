class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];

        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (n + i >= length) {
                answer[i] = num_list[idx++];
            } else {
                answer[i] = num_list[n + i];
            }
        }

        return answer;
    }
}