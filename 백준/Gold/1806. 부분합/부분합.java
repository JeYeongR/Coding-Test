import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        int[] arr = new int[N];
        String[] split2 = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(split2[i]);
        }

        int sum;
        int min = Integer.MAX_VALUE;
        for (int rt = 0; rt < N; rt++) {
            sum = 0;
            for (int lt = rt; lt < N; lt++) {
                if (lt - rt + 1 > min) break;

                sum += arr[lt];

                if (sum >= M) {
                    min = lt - rt + 1;
                    break;
                }

            }
        }

        if (min == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(min);
    }
}