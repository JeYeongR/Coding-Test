import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < N - 1; i++) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        int answer = 0;
        while (!queue.isEmpty() && dasom <= queue.peek()) {
            queue.offer(queue.poll() - 1);
            dasom++;
            answer++;
        }

        System.out.println(answer);
    }
}
