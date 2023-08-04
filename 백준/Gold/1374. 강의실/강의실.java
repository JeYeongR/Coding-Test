import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String[]> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            list.add(br.readLine().split(" "));
        }

        list.sort((o1, o2) -> {
            if (o1[1].equals(o2[1])) return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);

            return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
        });

        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (String[] strings : list) {
            while (!queue.isEmpty() && Integer.parseInt(strings[1]) >= queue.peek()) {
                queue.poll();
            }

            queue.offer(Integer.parseInt(strings[2]));
            answer = Math.max(answer, queue.size());
        }

        System.out.println(answer);
    }
}