class Solution {
    public int countNegatives(int[][] grid) {
        int answer = 0;
        for (int[] ints : grid) {
            int lt = 0;
            int rt = ints.length - 1;
            while(lt <= rt) {
                int mid = (lt + rt) / 2;
                if(ints[mid] < 0) {
                    answer += rt - mid + 1;
                    rt = mid - 1;
                } else {
                    lt = mid + 1;
                }
            }
        }

        return answer;
    }
}