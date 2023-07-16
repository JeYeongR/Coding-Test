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

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        String DNA = br.readLine();
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int G = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int answer = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < P; i++) {
            char rtChar = DNA.charAt(i);
            map.put(rtChar, map.getOrDefault(rtChar, 0) + 1);
        }

        if (checkDNA(map, A, C, G, T)) answer++;

        int lt = 0;
        for (int rt = P; rt < S; rt++) {
            char ltChar = DNA.charAt(lt++);
            map.put(ltChar, map.get(ltChar) - 1);

            if (map.get(ltChar) == 0) map.remove(ltChar);

            char rtChar = DNA.charAt(rt);
            map.put(rtChar, map.getOrDefault(rtChar, 0) + 1);

            if (checkDNA(map, A, C, G, T)) answer++;

        }

        System.out.println(answer);
    }

    public static boolean checkDNA(Map<Character, Integer> map, int A, int C, int G, int T) {
        if ((A != 0 && !map.containsKey('A')) || (map.containsKey('A') && map.get('A') < A)) return false;

        if ((C != 0 && !map.containsKey('C')) || (map.containsKey('C') && map.get('C') < C)) return false;

        if ((G != 0 && !map.containsKey('G')) || (map.containsKey('G') && map.get('G') < G)) return false;

        if ((T != 0 && !map.containsKey('T')) || (map.containsKey('T') && map.get('T') < T)) return false;

        return true;
    }
}