/**
 * 
 */
package singleNonDuplicate_540;

/**
 * @author W
 *
 */
class Solution_singleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
    	int low = 0;
    	int high = nums.length - 1;
    	while(low < high)
    	{
    		int mid = (high + low) / 2;
    		mid -= mid & 1;
    		if(nums[mid] == nums[mid + 1])
    			low = mid + 2;
    		else
    			high = mid;
    	}
    	return nums[low];
    }
}
