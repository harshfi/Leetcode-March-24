class Solution {
    private int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Start DFS from Pacific edges
        for (int i = 0; i < m; i++) {
            dfs(heights, pacific, i, 0);          // Left
            dfs(heights, atlantic, i, n - 1);     // Right
        }

        // Start DFS from Atlantic edges
        for (int j = 0; j < n; j++) {
            dfs(heights, pacific, 0, j);          // Top
            dfs(heights, atlantic, m - 1, j);     // Bottom
        }

        // Combine cells reachable by both oceans
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    private void dfs(int[][] heights, boolean[][] visited, int r, int c) {
        visited[r][c] = true;
        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];
            if (nr < 0 || nr >= m || nc < 0 || nc >= n || visited[nr][nc]) continue;
            if (heights[nr][nc] < heights[r][c]) continue; // Water can't flow uphill
            dfs(heights, visited, nr, nc);
        }
    }
}
