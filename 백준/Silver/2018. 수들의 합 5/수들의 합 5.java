import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int answer = 0;
        for (int lt = 1; lt <= N; lt++) {
            int sum = 0;
            for (int rt = lt; rt <= N; rt++) {
                sum += rt;

                if (sum == N) answer++;

                if (sum > N) break;
            }
        }

        System.out.println(answer);
    }
}