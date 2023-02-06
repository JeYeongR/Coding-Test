import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                K--;
            }

            if (K == 0) {
                result = i;
                break;
            }

        }

        if (K > 0) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
}