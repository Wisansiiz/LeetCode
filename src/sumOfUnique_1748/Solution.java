package sumOfUnique_1748;

class Solution {
	/*给你一个整数数组 nums 。数组中唯一元素是那些只出现
	 * 恰好一次 的元素。
	请你返回 nums 中唯一元素的 和 。
	示例 1：
	输入：nums = [1,2,3,2]
	输出：4
	解释：唯一元素为 [1,3] ，和为 4 。*/
    public int sumOfUnique(int[] nums) {
    	int sum = 0;
    	int n = nums.length;
    	for(int i = 0; i < n; i++)
    	{
    		int count = -1;
    		for(int j = 0; j < n; j++)
    		{
    			if(nums[i] == nums[j])
    				count ++;
    		}
    		if(count == 0 )
    			sum += nums[i];
    	}
    	//时间复杂度为O(n2),过于耗时
    	return sum;
    }
}