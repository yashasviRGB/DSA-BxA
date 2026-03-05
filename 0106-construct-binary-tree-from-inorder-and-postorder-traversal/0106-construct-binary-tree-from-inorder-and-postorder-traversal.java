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
    int index = 0;
    public TreeNode solve(int[] pre, int[] in, int start, int end, int n,
    Map<Integer, Integer> map)
    {
        if(index < 0 || start > end) return null;

        int element = pre[index];
        index--;
        int position = map.get(element);
        TreeNode root = new TreeNode(element);
        root.right = solve(pre,in, position + 1, end, n , map);
        root.left = solve(pre,in, start, position - 1, n , map);
    
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        int n = inorder.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(inorder[i],i);
        }
        index = n - 1;
        TreeNode root = solve(postorder, inorder,0,n-1,n,map);
        return root;


    }
}