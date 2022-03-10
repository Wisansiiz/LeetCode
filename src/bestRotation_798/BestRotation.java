package bestRotation_798;

public class BestRotation {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {2,3,1,4,0};
		System.out.print(new Solution().bestRotation(nums));
	}

}
//超时
class Solution {
	public int bestRotation(int[] nums) {
		int n = nums.length, max = Integer.MIN_VALUE, ans = 0;
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			int score = 0, j = 0;
			for (int k = i; k < n; k++, j++) {
				num[j] = nums[k];
				if (j >= nums[k])
					score++;
			}
			for (int k = 0; k < i; k++, j++) {
				num[j] = nums[k];
				if (j >= nums[k])
					score++;
			}
			if(score > max) {
				max = score;
				ans = i;
			}
		}
		return ans;
	}
}