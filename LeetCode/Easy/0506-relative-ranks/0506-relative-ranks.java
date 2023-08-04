class Solution {
    public String[] findRelativeRanks(int[] score) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int num : score) {
            queue.offer(num);
        }

        String[] answer = new String[score.length];
        while (!queue.isEmpty()) {
            int temp = queue.poll();

            for (int i = 0; i < score.length; i++) {
                if (temp == score[i]) answer[i] = getRank(score.length - queue.size());
            }
        }

        return answer;
    }

    String getRank(int n) {
        if (n == 1) return "Gold Medal";
        else if (n == 2) return "Silver Medal";
        else if (n == 3) return "Bronze Medal";
        else return "" + n;
    }
}