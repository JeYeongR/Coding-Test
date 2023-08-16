import java.util.Scanner;

public class Main {

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] operator = new int[4];
    static int[] nums;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt();
        }

        dfs(nums[0], 1);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int num, int depth) {
        if (depth == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] >= 1) {
                operator[i]--;

                switch (i) {
                    case 0:
                        dfs(num + nums[depth], depth + 1);
                        break;
                    case 1:
                        dfs(num - nums[depth], depth + 1);
                        break;
                    case 2:
                        dfs(num * nums[depth], depth + 1);
                        break;
                    case 3:
                        dfs(num / nums[depth], depth + 1);
                        break;
                }

                operator[i]++;
            }
        }
    }
}