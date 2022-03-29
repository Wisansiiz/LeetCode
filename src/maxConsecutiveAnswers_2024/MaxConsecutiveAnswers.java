package maxConsecutiveAnswers_2024;

public class MaxConsecutiveAnswers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String answerKey = "FFTT";
		int k = 2;
		System.out.println(new Solution().maxConsecutiveAnswers(answerKey, k));
	}

}
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
    	return Math.max(max(answerKey, k, 'T'), max(answerKey, k, 'F'));
    }
    public int max(String answerKey, int k, char c) {
		int n = answerKey.length();
		int ans = 0;
		for(int left = 0, right = 0, sum = 0; right < n; right++) {
			sum += answerKey.charAt(right) != c ? 1 : 0;
			while(sum > k) {
				sum -= answerKey.charAt(left++) != c ? 1 : 0;
			}
			ans = Math.max(ans, right - left + 1);
		}
		return ans;
	}
}