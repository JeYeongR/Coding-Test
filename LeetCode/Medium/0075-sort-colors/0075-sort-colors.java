class Solution {
    public void sortColors(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        
        int idx = 0;
        while (list.contains(0)) {
            nums[idx++] = list.remove(list.indexOf(0));
        }

        while (list.contains(1)) {
            nums[idx++] = list.remove(list.indexOf(1));
        }

        while (list.contains(2)) {
            nums[idx++] = list.remove(list.indexOf(2));
        }
    }
}