import java.util.Stack;

class Solution{
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if(!stack.isEmpty() && temp == stack.peek()) {
                stack.pop();
            } else {
                stack.push(temp);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}