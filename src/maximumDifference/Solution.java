/**
 * 
 */
package maximumDifference;

/**
 * @author Wisansiiz
 *给你一个下标从 0 开始的整数数组 nums ，该数组的大小为 n ，
 *请你计算 nums[j] - nums[i] 能求得的 最大差值 ，
 *其中 0 <= i < j < n 且 nums[i] < nums[j] 。
 *
返回 最大差值 。如果不存在满足要求的 i 和 j ，返回 -1 。

 */
class Solution {
    public int maximumDifference(int[] nums) {
    	int ans = -1;
    	int n = nums.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    	for(int i = 0; i < n; i++)
    	{
    		min = nums[i];
    		for(int j = i + 1; j < n; j++)
    		{
    			max = nums[j];
    			if(min < max && (max - min) > ans)
    			{
    				ans = max - min;
    			}
    		}
    	}
		return ans;
    }
}
