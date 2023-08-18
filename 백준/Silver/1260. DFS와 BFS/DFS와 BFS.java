import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static boolean[] visited;
    static boolean[][] arr;
    static Queue<Integer> queue;
    static int N, M, V;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        arr = new boolean[1001][1001];
        visited = new boolean[1001];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = true;
            arr[b][a] = true;
        }

        dfs(V);
        sb.append("\n");

        visited = new boolean[1001];

        bfs(V);

        System.out.println(sb);
    }

    static void dfs(int num) {
        visited[num] = true;

        sb.append(num)
                .append(" ");

        for (int i = 1; i <= N; i++) {
            if (arr[num][i] && !visited[i]) dfs(i);
        }
    }

    static void bfs(int num) {
        queue = new LinkedList<>();
        queue.add(num);

        visited[num] = true;

        sb.append(num)
                .append(" ");

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 1; i <= N; i++) {
                if (arr[temp][i] && !visited[i]) {
                    queue.add(i);

                    visited[i] = true;

                    sb.append(i)
                            .append(" ");
                }
            }
        }
    }
}