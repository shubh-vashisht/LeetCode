/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        int depth = helper(root);
        return helper2(root,depth,0);
    }
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }else if(root.right==null&&root.left==null){
            return 0;
        }else{
            return 1 + Math.max(helper(root.right),helper(root.left));
        }
    }
    public int helper2(TreeNode root, int d,int i){
        if(root==null){
            return 0;
        }else if(i==d){
            return root.val;
        }else{
            return helper2(root.left,d,i+1)+helper2(root.right,d,i+1); 
        }
    }
}
