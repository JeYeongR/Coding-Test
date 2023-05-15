class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int lengthOne = arr1.length;
        int lengthTwo = arr1[0].length;
        int[][] answer = new int[lengthOne][lengthTwo];

        for (int i = 0; i < lengthOne; i++) {
            for (int j = 0; j < lengthTwo; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}