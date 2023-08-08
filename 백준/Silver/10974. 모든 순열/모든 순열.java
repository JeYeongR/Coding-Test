import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static List<String> list = new ArrayList<>();
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        arr = new int[N];
        visited = new boolean[N];

        bfs(1);

        for (String s : list) {
            System.out.println(s);
        }
    }

    static void bfs(int depth) {
        if (depth > N) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(arr[i])
                        .append(" ");
            }
            list.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth - 1] = i + 1;
                bfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}