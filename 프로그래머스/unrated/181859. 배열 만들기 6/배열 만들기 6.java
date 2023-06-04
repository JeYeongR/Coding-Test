import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        for (int j : arr) {
            if (stk.isEmpty() || stk.peek() != j) {
                stk.push(j);
            } else {
                stk.pop();
            }
        }

        int[] answer = new int[stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            answer[i] = stk.pop();
        }

        return answer.length != 0 ? answer : new int[]{-1};
    }
}