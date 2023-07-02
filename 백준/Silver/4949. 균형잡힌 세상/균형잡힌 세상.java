import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();

            if (str.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isBalanced = false;
                    }
                } else if (c == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        isBalanced = false;
                    }
                }
            }

            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            stack.clear();
        }
    }
}