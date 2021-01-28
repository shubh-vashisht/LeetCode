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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
          TreeNode root = helper(0, nums.length,nums);
        return root;
    }
    public TreeNode helper(int start, int end,int[] nums){
        if(start==end){
            return null;
        }
        int max = -1;
        int j=0;
        for(int i=start;i<end;i++){
           if(nums[i]>max){
               max = nums[i];
               j = i;
           } 
        }
        TreeNode a = new TreeNode(max);
        a.right = helper(j+1,end,nums);
        a.left = helper(start,j,nums);
        return a;
    }
}
