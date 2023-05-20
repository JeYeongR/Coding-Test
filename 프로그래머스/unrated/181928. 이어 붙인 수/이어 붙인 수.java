class Solution {
    public int solution(int[] num_list) {
        String oddNums = "";
        String evenNums = "";
        for (int num : num_list) {
            if (num % 2 != 0) oddNums += num;
            else evenNums += num;
        }

        return Integer.parseInt(oddNums) + Integer.parseInt(evenNums);
    }
}