import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static int n;
    static int k;
    static Set<String> set = new HashSet<>();
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bfs(0, "");

        System.out.println(set.size());
    }

    static void bfs(int idx, String str) {
        if (idx == k) {
            set.add(str);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                bfs(idx + 1, str + arr[i]);
                visited[i] = false;
            }
        }
    }
}