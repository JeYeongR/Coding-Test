import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNum = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < testNum; i++) {
            int num = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int max = -1000001;
            int min = 1000001;

            for (int j = 0; j < num; j++) {
                String s = st.nextToken();
                max = Math.max(Integer.parseInt(s), max);
                min = Math.min(Integer.parseInt(s), min);
            }
            sb.append(min + " " + max);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}