class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int idx = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j==idx) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
            idx++;
        }
        return answer;
    }
}