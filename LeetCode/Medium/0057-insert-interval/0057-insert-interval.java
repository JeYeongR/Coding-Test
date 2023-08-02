class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        
        if (intervals.length == 0) return new int[][]{newInterval};

        for (int i = 0; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
            
            if (currentEnd < start) {
                list.add(new int[]{currentStart, currentEnd});
            } else if (currentStart > end) {
                list.add(new int[]{start, end});
                start = currentStart;
                end = currentEnd;
            } else {
                start = Math.min(start, currentStart);
                end = Math.max(end, currentEnd);
            }
        }
        list.add(new int[]{start, end});

        return list.toArray(int[][]::new);
    }
}