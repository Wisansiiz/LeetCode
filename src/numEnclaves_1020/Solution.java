/**
 * 
 */
package numEnclaves_1020;

/**
 * @author W
 *
 */
class Solution {
	// 主函数，计算岛屿数量
	int numEnclaves(int[][] grid) {
	    int res = 0;
	    int m = grid.length, n = grid[0].length;
	    for (int j = 0; j < n; j++) {
	        // 把靠上边的岛屿淹掉
	        dfs(grid, 0, j);
	        // 把靠下边的岛屿淹掉
	        dfs(grid, m - 1, j);
	    }
	    for (int i = 0; i < m; i++) {
	        // 把靠左边的岛屿淹掉
	        dfs(grid, i, 0);
	        // 把靠右边的岛屿淹掉
	        dfs(grid, i, n - 1);
	    }
	    // 遍历 grid
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (grid[i][j] == 1) {
	            	// 淹没岛屿，并更新最大岛屿面积
	                res++;
	            }
	        }
	    }
	    return res;
	}

	// 从 (i, j) 开始，将与之相邻的陆地都变成海水
	int dfs(int[][] grid, int i, int j) {
	    int m = grid.length, n = grid[0].length;
	    if (i < 0 || j < 0 || i >= m || j >= n) {
	        // 超出索引边界
	        return 0;
	    }
	    if (grid[i][j] == 0) {
	        // 已经是海水了
	        return 0;
	    }
	    // 将 (i, j) 变成海水
	    grid[i][j] = 0;
	    
	return 
	    dfs(grid, i + 1, j) +
	    dfs(grid, i, j + 1) +
	    dfs(grid, i - 1, j) +
	    dfs(grid, i, j - 1) + 1;
	}
}
