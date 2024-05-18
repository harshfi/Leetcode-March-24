class Solution {
    int ans;
    public int distributeCoins(TreeNode root) {
        ans = 0;
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode root){
        if (root == null) return 0;
        int coin = dfs(root.left) + dfs(root.right) + root.val - 1;
        ans += Math.abs(coin);
        return coin;
    }
}