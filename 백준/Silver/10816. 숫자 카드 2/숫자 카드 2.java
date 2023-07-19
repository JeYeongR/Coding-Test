import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arrN) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] arr = new int[map.size()];
        int idx = 0;
        for (Integer integer : map.keySet()) {
            arr[idx++] = integer;
        }

        Arrays.sort(arr);

        int[] answer = new int[M];
        for (int i = 0; i < M; i++) {
            int lt = 0;
            int rt = arr.length - 1;
            while (lt <= rt) {
                int key = arrM[i];
                int midKey = arr[(lt + rt) / 2];
                int mid = (lt + rt) / 2;

                if (key == midKey) {
                    answer[i] = map.get(midKey);
                    break;
                } else if (key < midKey) {
                    rt = mid - 1;
                } else {
                    lt = mid + 1;
                }
            }
            bw.write(answer[i] + " ");
        }

        bw.flush();
    }
}