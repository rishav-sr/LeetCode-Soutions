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
    int count=0;
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)
        return 0;
        solve(root,targetSum,(long)0);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return count;
    }

    public void solve(TreeNode root,int targetSum,long curSum) {
        if(root==null)
        return ;

        curSum+=root.val;
        if(curSum==targetSum)
        count++;
        solve(root.left,targetSum,curSum);
        solve(root.right,targetSum,curSum);
        if(curSum>targetSum)
        return;
    }
}