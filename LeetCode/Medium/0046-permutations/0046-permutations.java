class Solution {
    
    int[] nums;
    List<List<Integer>> answer = new ArrayList<>();
    boolean[] visited;
    
    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        visited = new boolean[nums.length];
        
        dfs(new ArrayList<>());
        
        return answer;
    }
    
    private void dfs(ArrayList<Integer> list) {
        if(list.size() == nums.length) {
            answer.add(new ArrayList<>(list));
            return;
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                list.add(nums[i]);
                dfs(list);
                list.remove(list.size() - 1);
                visited[i] = false;
            }
        }
    }
}