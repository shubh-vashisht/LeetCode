/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
​
class Solution {
   public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return abc(cloned,target.val);
    }
    public TreeNode abc(TreeNode a, int k){
        if(a==null){
            return null;
        }else{
            if(a.val==k){
                return a;
            }else{
                TreeNode left = abc(a.left,k);
                TreeNode right = abc(a.right,k);
                if(left==null){
                    return right;
                }else{
                    return left;
                }
            }
        }
    }
}
