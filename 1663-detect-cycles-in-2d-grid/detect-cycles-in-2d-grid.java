class Solution {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    int rows, cols;

    public boolean containsCycle(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    if (dfs(grid, visited, i, j, -1, -1, grid[i][j])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, boolean[][] visited, int r, int c, int pr, int pc, char ch) {
        if (visited[r][c]) return true;

        visited[r][c] = true;

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && grid[nr][nc] == ch) {
                if (nr == pr && nc == pc) continue;
                if (dfs(grid, visited, nr, nc, r, c, ch)) return true;
            }
        }

        return false;
    }
}