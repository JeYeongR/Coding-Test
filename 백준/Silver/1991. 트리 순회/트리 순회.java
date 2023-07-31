import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Tree tree = new Tree();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            tree.insert(st.nextToken().charAt(0), st.nextToken().charAt(0), st.nextToken().charAt(0));
        }

        Node root = tree.root;
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
    }
}

class Node {
    char val;
    Node left;
    Node right;

    public Node(char val) {
        this.val = val;
    }
}

class Tree {
    Node root;

    void insert(char val, char left, char right) {
        if (root == null) root = new Node(val);

        Node node = findNode(val, root);

        if (left != '.') node.left = new Node(left);

        if (right != '.') node.right = new Node(right);
    }

    Node findNode(char val, Node node) {
        if (node == null) return null;

        if (node.val == val) return node;

        Node left = findNode(val, node.left);
        if (left != null) return left;

        Node right = findNode(val, node.right);
        if (right != null) return right;

        return null;
    }

    void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val);
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val);
    }
}