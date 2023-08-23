import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        int B = Integer.parseInt(split[2]);
        int max = 0;
        int min = 256;
        int time = Integer.MAX_VALUE;
        int height = 0;

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] s = sc.nextLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(s[j]);
                max = Math.max(arr[i][j], max);
                min = Math.min(arr[i][j], min);
            }
        }

        for (int i = max; i >= min; i--) {
            int tempTime = 0;
            int itemCount = B;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (arr[j][k] > i) {
                        itemCount += arr[j][k] - i;
                        tempTime += 2 * (arr[j][k] - i);
                    } else if (arr[j][k] < i) {
                        itemCount -= i - arr[j][k];
                        tempTime += i - arr[j][k];
                    }
                }
            }
            if (itemCount >= 0 && time > tempTime) {
                height = i;
                time = tempTime;
            }
        }

        System.out.println(time + " " + height);
    }
}