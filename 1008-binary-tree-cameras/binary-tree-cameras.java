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
    Map<TreeNode,Boolean> map= new HashMap<>();
    int c=0;
    public int minCameraCover(TreeNode root) {

        map =  new HashMap<>();

      TreeNode  parent=null;
      c=0;
       map.put(null,true);
       find(root,parent);


       return c;
        
    }
    public void find(TreeNode root,TreeNode parent){

        if(root==null) return;

        find(root.left,root);
        find(root.right,root);

        if((parent==null &&!map.containsKey(root))|| !map.containsKey(root.left) || !map.containsKey(root.right) ){
            c++;
            map.put(parent,true);
            map.put(root,true);
            map.put(root.left,true);
            map.put(root.right,true);
        }

    }
}