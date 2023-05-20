class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        for (int num : num_list) {
            multiply *= num;
            sum += num;
        }

        sum *= sum;

        return multiply > sum ? 0 : 1;
    }
}