class Solution {
    
    List<List<Integer>> answer = new ArrayList<>();
    int[] nums;
    
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        
        dfs(new ArrayList<>(), 0);
        
        return answer;
    }
    
    private void dfs(List<Integer> list, int startIdx) {
        answer.add(new ArrayList<>(list));

        for (int i = startIdx; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}