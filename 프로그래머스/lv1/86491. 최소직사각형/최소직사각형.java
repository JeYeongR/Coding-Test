class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wMax = 0;
        int hMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            wMax = Math.max(wMax, max);
            hMax = Math.max(hMax, min);
        }

        answer = wMax * hMax;

        return answer;
    }
}