class Solution {
    public int[] solution(long n) {
        int i = 0;
        long save = n;
        while (n > 0) {
            n = (int) (n / 10);
            i++;
        }

        int[] answer = new int[i];
        for (int j = 0; j < i; j++) {
            answer[j] = (int) (save % 10);
            save = (int) (save / 10);
        }

        return answer;
    }
}