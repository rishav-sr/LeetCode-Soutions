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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1list= new ArrayList<>();
        List<Integer> r2list= new ArrayList<>();
        solve(root1,r1list);
        solve(root2,r2list);
        System.out.println(r1list);

        System.out.println(r2list);
        if(r1list.size()!=r2list.size())
        {
            return false;
        }
        for(int i=0;i<r1list.size();i++) {
            if(!r1list.get(i).equals(r2list.get(i)))
            {
                return false;
            }
            
        }
        return true;
    }

    public void solve(TreeNode root,List<Integer> r1list) {
        if(root==null)
        return;
        if(root.left==null && root.right==null) {
            r1list.add(root.val);
            return;
        }
        
        solve(root.left,r1list);
        solve(root.right,r1list);
    }
}