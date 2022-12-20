import java.util.LinkedList;
import java.util.Queue;

class Solution {
     public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for (int i : prices) {
            queue.add(i);
        }

        int idx = 0;
        while (!queue.isEmpty()) {
            int time = 0;
            for (int i = idx + 1; i < prices.length; i++) {
                time++;
                if (queue.peek() > prices[i]) {
                    break;
                }
            }

            answer[idx++] = time;
            queue.poll();
        }

        return answer;
    }
}
