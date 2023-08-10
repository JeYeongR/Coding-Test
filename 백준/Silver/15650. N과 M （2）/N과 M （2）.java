import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N;
    static int M;
    static List<String> list = new ArrayList<>();
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N];
        arr = new int[M];

        bfs(0, 0);

        for (String s : list) {
            System.out.println(s);
        }
    }

    static void bfs(int start, int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(arr[i])
                        .append(" ");
            }
            list.add(sb.toString());
            return;
        }

        for (int i = start; i < N; i++) {
            arr[depth] = i + 1;
            bfs(i + 1, depth + 1);
        }
    }
}