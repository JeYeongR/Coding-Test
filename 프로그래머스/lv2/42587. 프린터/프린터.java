import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> queue2 = new LinkedList<>();
        int answer = 1;

        for (int i : priorities) {
            queue.add(i);
            queue2.add(i);
        }

        int idx = location;
        while (!queue2.isEmpty()) {
            if (queue2.peek() == queue.peek()) {
                if(idx==0) {
                    break;
                }
                queue2.poll();
                queue.poll();
                answer++;
                idx--;

            } else if(queue2.peek() < queue.peek()){
                int save = queue2.poll();
                queue2.add(save);
                if(idx == 0) {
                    idx = queue2.size();
                }
                idx--;
            }

        }

        return answer;
    }
}