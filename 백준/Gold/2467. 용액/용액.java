import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[2];
        int min = Integer.MAX_VALUE;
        int lt = 0;
        int rt = N - 1;
        while (lt < rt) {
            int sum = Math.abs(arr[lt] + arr[rt]);
            if (sum < min) {
                min = sum;
                answer[0] = arr[lt];
                answer[1] = arr[rt];
            }

            if (sum == 0) {
                answer[0] = arr[lt];
                answer[1] = arr[rt];
                break;
            }

            if (arr[lt] + arr[rt] > 0) rt--;
            else lt++;
        }
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}