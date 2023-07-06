import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String answer = "<";
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < M - 1; i++) {
                queue.offer(queue.poll());
            }

            answer += queue.poll();

            if(!queue.isEmpty()) {
                answer += ", ";
            } else {
                answer += ">";
            }
        }

        System.out.println(answer);
    }
}