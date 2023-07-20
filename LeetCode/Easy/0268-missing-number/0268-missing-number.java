class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        
        int temp = 0;
        for(int i=1; i<=nums.length; i++) {
            temp += i;
        }
        
        return temp - sum;
    }
}