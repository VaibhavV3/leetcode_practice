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
    private int[] nums;
    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums=nums;
        return convert(0,nums.length-1);
    }
    
    private TreeNode convert(int l,int h){
        if(l>h)
            return null;
        int mid=(l+h)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=convert(l,mid-1);
        node.right=convert(mid+1,h);
        return node;
    }
    
}
