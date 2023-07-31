import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Node node = new Node();

            List<String> list = new ArrayList<>();
            while (n-- > 0) {
                String str = br.readLine();

                insert(node, str);
                list.add(str);
            }

            boolean isConsistent = true;
            for (String str : list) {
                if (search(node, str)) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) sb.append("YES\n");
            else sb.append("NO\n");
        }

        System.out.println(sb);
    }

    static void insert(Node node, String str) {
        for (int i = 0; i < str.length(); i++) {
            node = node.childNode.computeIfAbsent(str.charAt(i), key -> new Node());
        }

        node.isLastNode = true;
    }

    static boolean search(Node node, String str) {
        for (int i = 0; i < str.length(); i++) {
            node = node.childNode.getOrDefault(str.charAt(i), null);

            if (node == null) return false;
        }

        if (node.isLastNode) {
            if (node.childNode.isEmpty()) {
                return false;
            }
        }

        return true;
    }
}

class Node {
    Map<Character, Node> childNode = new HashMap<>();

    boolean isLastNode;
}