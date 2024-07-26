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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> list= new ArrayList<>();
        if(root==null) return list;

        q.add(root);
        while(!q.isEmpty()){
            int i=0;
            int n=q.size();
            while(i<n){
                TreeNode nn= q.poll();
                if(i==0) list.add(nn.val);
                 if(nn.right!=null) q.add(nn.right);
                if(nn.left!=null) q.add(nn.left);
               
                i++;
            }

        }
        return list;
        
    }
}