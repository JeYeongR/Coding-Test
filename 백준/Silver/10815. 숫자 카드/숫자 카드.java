import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        String[] split = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            set.add(Integer.valueOf(split[i]));
        }

        int M = Integer.parseInt(br.readLine());
        String[] split2 = br.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            if (set.contains(Integer.valueOf(split2[i]))) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        
        bw.flush();
    }
}
