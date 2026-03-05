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
    int Sum = 0;
    public boolean solve(TreeNode root, int currentSum){
        if(root == null) return false;
        int tempSum = currentSum + root.val;
        boolean left = solve(root.left,tempSum);
        boolean right = solve(root.right,tempSum);
        if(root.left == null && root.right == null){
            return tempSum == Sum;
        }
        return left || right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Sum = targetSum;
        // int curr = root.val;
        return solve(root, 0);
    }
}