import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        int k = Integer.parseInt(br.readLine());

        // 시작
        long answer = 0;
        for (int lt = 0; lt < n; lt++) {
            long sum = 0;
            int rt = lt;

            while (n > rt) {
                sum += arr[rt];

                if (sum > k) {
                    answer += n - rt;
                    break;
                } else {
                    rt++;
                }
            }
        }

        System.out.println(answer);
    }
}