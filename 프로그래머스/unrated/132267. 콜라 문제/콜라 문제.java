class Solution {
     public int solution(int a, int b, int n) {
        int answer = 0;

        int cola = n;
        while (cola >= a) {
            answer += cola / a * b;
            cola = cola % a + cola / a * b;
        }

        return answer;
    }
}