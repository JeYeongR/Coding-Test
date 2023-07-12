class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for (int num : nums) {
            if (num > 0) {
                queue1.offer(num);
            } else {
                queue2.offer(num);
            }
        }

        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0 && !queue1.isEmpty()) {
                answer[i] = queue1.poll();
            } else if (!queue2.isEmpty()) {
                answer[i] = queue2.poll();
            }
        }

        return answer;
    }
}