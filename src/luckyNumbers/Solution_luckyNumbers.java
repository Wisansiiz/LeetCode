/**
 * 
 */
package luckyNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * @author W
 *
 */
class Solution_luckyNumbers {
	public List<Integer> luckyNumbers (int[][] matrix) {
		List<Integer> res = new ArrayList<Integer>();
		int n = matrix.length, m = matrix[0].length;	
		for(int i = 0; i < n; i ++)
		{
			int t  = 0;
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for(int j = 0; j < m; j ++)
			{
				if(matrix[i][j] < min)
				{
					min = matrix[i][j];
					t = j;
				}
			}
			for(int k = 0; k < n; k ++)
			{
				if(matrix[k][t] > max)
				{
					max = matrix[k][t];
				}
			}
			if(max == min)
			{
				res.add(max);
				break;
			}
		}
		return res;
	}
}
