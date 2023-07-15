import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();
        int min = N + 1;
        int lt = 0;
        for (int rt = 0; rt < N; rt++) {
            int rtKey = arr[rt];
            map.put(rtKey, map.getOrDefault(rtKey, 0) + 1);
            if (map.containsKey(1) && map.get(1) >= K) {
                min = Math.min(min, rt - lt + 1);

                while (map.get(1) != K - 1 || arr[lt] != 1) {
                    int ltKey = arr[lt++];
                    map.put(ltKey, map.get(ltKey) - 1);

                    if (map.get(ltKey) == 0) map.remove(ltKey);
                }
            }
        }

        int answer = min == N + 1 ? -1 : min;
        System.out.println(answer);
    }
}