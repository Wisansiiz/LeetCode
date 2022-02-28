/**
 * 
 */
package maximumRequests_1601;

import java.util.Arrays;

/**
 * @author Wisansiiz
 *
 */
public class MaximumRequests {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 3;
		int[][] requests = 
			{{1,2},{1,2},{2,2},{0,2},{2,1},{1,1},{1,2}};
//			{{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}};
		System.out.print(new Solution().maximumRequests(n, requests));
	}

}
class Solution {
    public int maximumRequests(int n, int[][] requests) {
    	int m = requests.length;
    	int[] arr = new int [n];
    	int ans = 0, res = 0;
    	for(int i = 0; i < (1 << m); ++i)
    	{
    		Arrays.fill(arr, 0);
    		for(int j = 0; j < m; j++)
    		{
    			if((i & (1 << j)) != 0)
    			{
    				++arr[requests[j][0]];
    				--arr[requests[j][1]];
    			}
    		}
    		int k = 0;
    		for(; k < n; k++)
    			if(arr[k] != 0)
    				break;
    		if(k == n)
    		{
    			res = Integer.bitCount(i);
    			if(ans < res)
    				ans = res;
    		}
    			
    	}
		return ans;
    }
}