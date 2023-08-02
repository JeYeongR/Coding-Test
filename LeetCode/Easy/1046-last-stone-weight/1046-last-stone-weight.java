class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int num1 = queue.poll();
            int num2 = queue.poll();

            if (num1 != num2) {
                queue.offer(num1 - num2);
            }
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }
}