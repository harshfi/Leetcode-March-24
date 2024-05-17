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
    int t;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        t=target;
        return create(root);

        
    }
    public TreeNode create(TreeNode root){
        if(root==null)return null;
        if(root.left==null && root.right==null && root.val==t){
            return root=null;
            }
        
        TreeNode n = new TreeNode();
       
        n.left=create(root.left);
        n.right=create(root.right);
        if(n.left==null && n.right==null && root.val==t){
            return root=null;
            }
            n.val=root.val;

        return n;
    }
}