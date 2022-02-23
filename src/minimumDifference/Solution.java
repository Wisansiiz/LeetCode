/**
 * 
 */
package minimumDifference;

import java.util.Arrays;

/**
 * @author W
 *
 */
class Solution {
	public int minimumDifference(int[] nums, int k) {
		int min = Integer.MAX_VALUE;
		int n = nums.length;
		Arrays.sort(nums);
		for(int i = 0; i + k - 1 < n; i++)
		{
			min = Math.min(min, nums[i + k - 1] - nums [i]);
		}
		return min;
    }
}
