/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned == null) return null;
        
        if(target.val == cloned.val) return cloned;
        
        // 오리지널이랑 클론 굳이 2개가 필요한가?
        TreeNode left = getTargetCopy(original, cloned.left, target);
        if (left != null)  return left;
        
        return getTargetCopy(original, cloned.right, target);
    }
}