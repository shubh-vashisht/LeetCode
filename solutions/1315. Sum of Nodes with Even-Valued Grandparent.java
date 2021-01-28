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
    public int sumEvenGrandparent(TreeNode root) {
        return helper(root, 0);
    }
    public int helper(TreeNode ab, int s){
        if(ab==null){
            return 0;
        }
        if(ab.val%2!=0){
            return helper(ab.right,s)+helper(ab.left,s)+s;
        }else{
            return moo(ab,0)+ helper(ab.right,s)+helper(ab.left,s)+s;
        }
    }
    public int moo(TreeNode a,int depth){
        if(a==null){
           return 0; 
        }
        if(depth==2){
            return a.val;
        }else{
            return moo(a.left,depth+1)+ moo(a.right,depth+1); 
        }
    }
}
