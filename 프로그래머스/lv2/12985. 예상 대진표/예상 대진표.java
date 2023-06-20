import java.util.*;

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int player1 = queue.poll();
            int player2 = queue.poll();

            if (player1 == a && player2 == b || player1 == b && player2 == a) break;


            if (player1 == a || player1 == b) {
                queue.offer(player1);
            } else if (player2 == a || player2 == b) {
                queue.offer(player2);
            } else {
                queue.offer(player1);
            }

            if (queue.size() == n / 2) {
                answer++;
                n /= 2;
            }
        }

        return answer;
    }
}