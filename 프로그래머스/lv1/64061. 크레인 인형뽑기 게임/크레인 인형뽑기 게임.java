import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int move : moves) {
            for (int[] num : board) {
                if (num[move - 1] != 0) {
                    if (!stack.isEmpty() && stack.peek() == num[move - 1]) {
                        stack.pop();
                        answer+=2;
                    } else {
                        stack.add(num[move - 1]);
                    }
                    num[move - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}