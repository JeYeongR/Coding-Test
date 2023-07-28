/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // 중위순회: 왼쪽 자식 -> 뿌리 -> 오른쪽 자식
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode node = root;
        // 왼쪽 끝까지 내려감
        while(node != null) {
            stack.push(node);
            node = node.left;
        }
        
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.add(temp.val);
            node = temp.right;
            // 왼쪽 끝까지 내려감
            while(node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        
        return list;
    }
}