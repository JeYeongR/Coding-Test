class Solution {
    public int[] solution(int n) {
        int length = (int) Math.round((double) n / 2);
        int[] answer = new int[length];

        int idx = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && (idx < length)) {
                    answer[idx] = i;
                    idx++;
            }
        }

        return answer;
    }
}