import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String command = br.readLine();

            if (command.contains("push")) {
                deque.offer(Integer.parseInt(command.split(" ")[1]));
            } else if (command.equals("pop")) {
                if (!deque.isEmpty()) System.out.println(deque.poll());
                else System.out.println(-1);
            } else if (command.equals("size")) {
                System.out.println(deque.size());
            } else if (command.equals("empty")) {
                if (!deque.isEmpty()) System.out.println(0);
                else System.out.println(1);
            } else if (command.equals("front")) {
                if (!deque.isEmpty()) System.out.println(deque.peekFirst());
                else System.out.println(-1);
            } else if (command.equals("back")) {
                if (!deque.isEmpty()) System.out.println(deque.peekLast());
                else System.out.println(-1);
            }
        }
    }
}