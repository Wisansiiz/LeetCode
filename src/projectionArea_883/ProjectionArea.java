package projectionArea_883;

public class ProjectionArea {
    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {3, 4}};
        System.out.println(new Solution().projectionArea(grid));
    }
}

class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int ans = 0, ans2 = 0, ans3 = 0;
        for (int i = 0; i < n; i++) {
            int xz = 0, yz = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) ans++;
                xz = Math.max(xz, grid[i][j]);
                yz = Math.max(yz, grid[j][i]);
            }
            ans2 += xz;
            ans3 += yz;
        }
        return ans + ans2 + ans3;
    }
}