import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int answer = 0;
        for (int i = 0; i < N; i++) {
            String temp = sc.next();
            Stack<Character> stack = new Stack<>();
            for (char c : temp.toCharArray()) {
                if(!stack.isEmpty() && stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty()) answer++;
        }

        System.out.println(answer);
    }
}