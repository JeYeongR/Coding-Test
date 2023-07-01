import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] strings = new String[T];
        for (int i = 0; i < T; i++) {
            strings[i] = sc.next();
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            boolean isVps = true;
            for (char c : strings[i].toCharArray()) {
                if (c == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isVps = false;
                        break;
                    }
                } else {
                    stack.push(c);
                }
            }

            if (isVps && stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");

            stack.clear();
        }
    }
}
