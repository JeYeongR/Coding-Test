class Solution {
    public long pickGifts(int[] gifts, int k) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            queue.offer(gift);
        }

        while (k-- > 0) {
            queue.offer((int) Math.sqrt(queue.poll()));
        }

        return queue.stream().mapToLong(Integer::longValue).sum();
    }
}