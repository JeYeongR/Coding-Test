class Solution {
    
    int[] nums;
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        this.nums = nums;

        dfs(0, new ArrayList<>());

        return answer;
    }

    private void dfs(int start, ArrayList<Integer> list) {
        if (list.size() > 1)
            answer.add(new ArrayList<>(list));

        Set<Integer> used = new HashSet<>();

        for (int i = start; i < nums.length; ++i) {
            if (used.contains(nums[i]))
                continue;
            if (list.isEmpty() || nums[i] >= list.get(list.size() - 1)) {
                used.add(nums[i]);
                list.add(nums[i]);
                dfs(i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }
}