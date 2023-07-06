import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] findArr = new int[M];
        for (int i = 0; i < M; i++) {
            findArr[i] = sc.nextInt();
        }

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            int idx = 0;
            for (Integer integer : deque) {
                if (integer == findArr[i]) {
                    break;
                } else {
                    idx++;
                }
            }

            int half = deque.size() % 2 == 0 ? deque.size() / 2 : deque.size() / 2 + 1;
            if (idx < half) {
                while (deque.peek() != findArr[i]) {
                    deque.offerLast(deque.pollFirst());
                    count++;
                }
            } else {
                while (deque.peek() != findArr[i]) {
                    deque.offerFirst(deque.pollLast());
                    count++;
                }
            }

            deque.poll();
        }
        System.out.println(count);
    }
}
