package countMaxOrSubsets_2044;

public class CountMaxOrSubsets {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {2,2,2};
		System.out.print(new Solution().countMaxOrSubsets(nums));
	}

}
class Solution {
    public int countMaxOrSubsets(int[] nums) {
    	int n = nums.length, mask = 1 << n;
    	int max = Integer.MIN_VALUE, ans = 0;
    	for(int i = 0; i < mask; i++) {
    		int bitwise = 0;
    		for(int j = 0; j < n; j++) {
    			if(((i >> j) & 1) == 1) {
    				bitwise |= nums[j];
    			}
    		}
    		if(bitwise > max) {
    			max = bitwise;
    			ans = 1;
    		}
    		else if(max == bitwise){
    			ans++;
    		}
    	}
    	return ans;
    }
}