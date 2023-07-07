import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            while (num <= value) {
                stack.push(num++);
                answer.append("+\n");
            }

            if (stack.peek() == value) {
                stack.pop();
                answer.append("-\n");
            } else {
                answer.delete(0, answer.length())
                        .append("NO");
                break;
            }
        }

        System.out.println(answer);
    }
}