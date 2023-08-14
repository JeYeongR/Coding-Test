import java.util.Scanner;

public class Main {

    static int answer = 0;

    static int R, C, K;
    static boolean[][] visited;
    static char[][] map;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        K = sc.nextInt();
        sc.nextLine();

        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        visited[R - 1][0] = true;

        dfs(R - 1, 0, 1);

        System.out.println(answer);
    }

    static void dfs(int r, int c, int depth) {
        if (r == 0 && c == C - 1) {
            if (depth == K) answer++;
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nextR = r + dx[i];
            int nextC = c + dy[i];

            if (nextR >= 0 && nextR < R && nextC >= 0 && nextC < C && !visited[nextR][nextC] && map[nextR][nextC] != 'T') {
                visited[nextR][nextC] = true;
                dfs(nextR, nextC, depth + 1);
                visited[nextR][nextC] = false;
            }
        }
    }
}