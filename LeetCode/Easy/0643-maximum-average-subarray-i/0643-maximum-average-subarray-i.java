class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];

            max = Math.max(max, sum);
        }

        return (double) max / k;
    }
}