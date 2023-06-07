class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int max = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) max = i;
        }

        int num = b / max;
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                answer = 2;
                break;
            }
        }

        return answer;
    }
}