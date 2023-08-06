import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (K-- > 0) {
            int num = sc.nextInt();

            if (num != 0) stack.push(num);
            else stack.pop();
        }

        int answer = 0;
        for (Integer integer : stack) {
            answer += integer;
        }

        System.out.println(answer);
    }
}