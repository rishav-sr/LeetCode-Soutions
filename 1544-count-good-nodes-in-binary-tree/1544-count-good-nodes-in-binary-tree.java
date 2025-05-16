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
    public int goodNodes(TreeNode root) {
        return solve(root,root.val);
    }
    public int solve(TreeNode root,int prev) {
        if(root==null)
        return 0;
        int val=0;
        if(prev<=root.val) {
            prev=root.val;
            val++;
        }
        return solve(root.left,prev) +solve(root.right,prev)+val;
    }
}