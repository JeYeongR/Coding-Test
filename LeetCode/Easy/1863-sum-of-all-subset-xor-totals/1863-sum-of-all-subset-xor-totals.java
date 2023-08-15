class Solution {
    
    int[] nums;
    
    public int subsetXORSum(int[] nums) {
        this.nums = nums;
        
        return dfs( 0, 0);
    }

    private int dfs(int i, int num) {
        if (i == nums.length) return num;

        int x = dfs(i + 1, num);
        int y = dfs(i + 1, nums[i] ^ num);
        
        return x + y;
  }
}