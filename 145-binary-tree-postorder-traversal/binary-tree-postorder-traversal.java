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
    List<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root) {
        list=new ArrayList<>();
        print(root);
        return list;
    }
    public  void print(TreeNode root) {
		if(root==null)return ;
		
		print(root.left);
		print(root.right);
        list.add(root.val);
	}
}