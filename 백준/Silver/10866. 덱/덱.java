import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            if (command.contains("push_front")) {
                deque.offerFirst(Integer.valueOf(command.split(" ")[1]));
            } else if (command.contains("push_back")) {
                deque.offerLast(Integer.valueOf(command.split(" ")[1]));
            } else if (command.contains("pop_front")) {
                if (!deque.isEmpty()) System.out.println(deque.pollFirst());
                else System.out.println(-1);
            } else if (command.contains("pop_back")) {
                if (!deque.isEmpty()) System.out.println(deque.pollLast());
                else System.out.println(-1);
            } else if (command.contains("size")) {
                System.out.println(deque.size());
            } else if (command.contains("empty")) {
                if (deque.isEmpty()) System.out.println(1);
                else System.out.println(0);
            } else if (command.contains("front")) {
                if (!deque.isEmpty()) System.out.println(deque.peekFirst());
                else System.out.println(-1);
            } else if (command.contains("back")) {
                if (!deque.isEmpty()) System.out.println(deque.peekLast());
                else System.out.println(-1);
            }
        }
    }
}