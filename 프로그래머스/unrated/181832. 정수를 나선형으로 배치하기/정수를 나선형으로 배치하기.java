class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int num = 2;
        int idx1 = 0;
        int idx2 = 0;
        answer[idx2][idx1] = 1;
        while (num <= n * n) {
            while (idx1 + 1 < n && answer[idx2][idx1 + 1] == 0) {
                answer[idx2][++idx1] = num++;
            }

            while (idx2 + 1 < n && answer[idx2 + 1][idx1] == 0) {
                answer[++idx2][idx1] = num++;
            }

            while (idx1 - 1 >= 0 && answer[idx2][idx1 - 1] == 0) {
                answer[idx2][--idx1] = num++;
            }

            while (idx2 - 1 >= 0 && answer[idx2 - 1][idx1] == 0) {
                answer[--idx2][idx1] = num++;
            }
        }

        return answer;
    }
}