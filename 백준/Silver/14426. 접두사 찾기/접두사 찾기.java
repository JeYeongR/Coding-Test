import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().strip());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Node node = new Node();
        for (int i = 0; i < N; i++) {
            insert(node, br.readLine());
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            if (search(node, br.readLine())) answer++;
        }

        System.out.println(answer);
    }

    static void insert(Node node, String str) {
        for (int i = 0; i < str.length(); i++) {
            node = node.childNode.computeIfAbsent(str.charAt(i), key -> new Node());
        }
    }

    static boolean search(Node node, String str) {
        for (int i = 0; i < str.length(); i++) {
            node = node.childNode.getOrDefault(str.charAt(i), null);

            if (node == null) return false;
        }

        return true;
    }
}

class Node {
    Map<Character, Node> childNode = new HashMap<>();
}