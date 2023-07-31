import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    static int[] parents;
    static boolean[] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        parents = new int[N + 1];
        isVisited = new boolean[N + 1];

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            map.computeIfAbsent(num1, key -> new ArrayList<>()).add(num2);
            map.computeIfAbsent(num2, key -> new ArrayList<>()).add(num1);
        }

        dfs(1);
        
        for (int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }
    }

    static void dfs(int num) {
        isVisited[num] = true;

        for (int node : map.get(num)) {
            if (!isVisited[node]) {
                parents[node] = num;
                dfs(node);
            }
        }
    }
}