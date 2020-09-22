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
 * 
 * Iterative solution can be implemented using stacks.
 * add right first and then left nodes and pop to add correct val's to the list.
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root==null){return ans;}
        ans.add(root.val);
        if(root.left!=null){
           ans.addAll(preorderTraversal(root.left)); 
        }
        if(root.right!=null){
           ans.addAll(preorderTraversal(root.right)); 
        }
        return ans;
    }
}