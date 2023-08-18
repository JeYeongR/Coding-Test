import java.util.Scanner;

public class Main {

    static boolean[] visited;
    static boolean[][] arr;
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = true;
            arr[b][a] = true;
        }

        dfs(1);

        System.out.println(answer);
    }

    static void dfs(int num) {
        visited[num] = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[num][i] && !visited[i]) {
                answer++;
                dfs(i);
            }
        }
    }
}