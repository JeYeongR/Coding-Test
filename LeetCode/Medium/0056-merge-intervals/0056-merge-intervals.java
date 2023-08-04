class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (o1, o2) -> o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]);

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length - 1; i++) {
            int nextStart = intervals[i + 1][0];
            int nextEnd = intervals[i + 1][1];

            if (end < nextStart) {
                list.add(new int[]{start, end});
                start = nextStart;
                end = nextEnd;
            } else {
                start = Math.min(start, nextStart);
                end = Math.max(end, nextEnd);
            }
        }
        list.add(new int[]{start, end});

        return list.toArray(int[][]::new);
    }
}