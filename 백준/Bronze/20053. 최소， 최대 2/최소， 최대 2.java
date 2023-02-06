import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int nums = Integer.parseInt(br.readLine());
            String[] strs = br.readLine().split(" ");
            int max = Integer.parseInt(strs[0]);
            int min = Integer.parseInt(strs[0]);

            for (int j = 0; j < nums; j++) {
                max = Math.max(Integer.parseInt(strs[j]), max);
                min = Math.min(Integer.parseInt(strs[j]), min);
            }
            sb.append(min + " " + max);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}