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
    public boolean solve(TreeNode p, TreeNode q){
        if((p == null && q != null) || (p != null && q == null)) return false;
        if(p == null && q == null) return true;

        boolean lefttree = solve(p.left, q.right);
        boolean righttree = solve(p.right, q.left);
        boolean rootcompare = p.val == q.val;
        return lefttree && righttree && rootcompare;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return solve(root.left, root.right);
    }
}