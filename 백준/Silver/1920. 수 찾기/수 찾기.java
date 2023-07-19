import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arrN = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arrM = new int[M];
        for (int i = 0; i < M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrN);

        int[] answer = new int[M];
        for (int i = 0; i < M; i++) {
            int lt = 0;
            int rt = arrN.length - 1;
            while (lt <= rt) {
                int key = arrM[i];
                int midKey = arrN[(lt + rt) / 2];
                int mid = (lt + rt) / 2;

                if (key == midKey) {
                    answer[i] = 1;
                    break;
                } else if (key < midKey) {
                    rt = mid - 1;
                } else {
                    lt = mid + 1;
                }
            }
            bw.write(answer[i] + "\n");
        }

        bw.flush();
    }
}