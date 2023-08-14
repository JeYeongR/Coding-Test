import java.util.Scanner;

public class Main {

    static int answer = 0;
    static int N, S;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        S = sc.nextInt();
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0, 0);

        answer = S == 0 ? answer - 1 : answer;
        System.out.println(answer);
    }

    static void dfs(int sum, int depth) {
        if (depth == arr.length) {
            if (sum == S) answer++;
            return;
        }

        dfs(sum, depth + 1);
        dfs(sum + arr[depth], depth + 1);
    }
}