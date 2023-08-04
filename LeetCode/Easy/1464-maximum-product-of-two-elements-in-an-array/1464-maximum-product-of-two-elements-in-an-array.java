class Solution {
    public int maxProduct(int[] nums) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : nums) {
            queue.offer(num);
        }

        return (queue.poll() - 1) * (queue.poll() - 1);
    }
}