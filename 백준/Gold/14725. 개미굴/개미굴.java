import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Node root = new Node();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());

            List<String> list = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                list.add(st.nextToken());
            }

            insert(root, list);
        }

        print(root, "");
    }

    static void insert(Node node, List<String> list) {
        if (list.isEmpty()) return;

        node = node.childNode.computeIfAbsent(list.remove(0), key -> new Node());

        insert(node, list);
    }

    static void print(Node node, String depth) {
        for (String s : node.childNode.keySet()) {
            System.out.println(depth + s);

            print(node.childNode.get(s), depth + "--");
        }
    }
}

class Node {
    Map<String, Node> childNode = new TreeMap<>();
}