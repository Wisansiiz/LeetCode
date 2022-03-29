package maxConsecutiveAnswers_2024;

import java.util.HashMap;

public class MaxConsecutiveAnswers {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String answerKey = "TTFTTFTT";
		int k = 1;
		System.out.println(new Solution2().maxConsecutiveAnswers(answerKey, k));
	}

}

class Solution {
	public int maxConsecutiveAnswers(String answerKey, int k) {
		return Math.max(max(answerKey, k, 'T'), max(answerKey, k, 'F'));
	}

	public int max(String answerKey, int k, char c) {
		int n = answerKey.length();
		int ans = 0;
		for (int left = 0, right = 0, sum = 0; right < n; right++) {
			sum += answerKey.charAt(right) != c ? 1 : 0;
			while (sum > k) {
				sum -= answerKey.charAt(left++) != c ? 1 : 0;
			}
			ans = Math.max(ans, right - left + 1);
		}
		return ans;
	}
}

class Solution2 {
	public int maxConsecutiveAnswers(String answerKey, int k) {
		return Math.max(max2(answerKey, k, 'F'), max2(answerKey, k, 'T'));
	}

	int max2(String answerKey, int k, char ch) {
		HashMap<Character, Integer> window = new HashMap<>();
		window.put('T',window.getOrDefault('T',0));
		window.put('F',window.getOrDefault('F',0));
		int left = 0, right = 0;
		int ans = 0;
		while (right < answerKey.length()) {
			char c = answerKey.charAt(right++);
			if(c == ch)
				window.put(c, window.getOrDefault(c, 0) + 1);
			// 判断左侧是否收缩
			while (window.get(ch) > k) {
				char d = answerKey.charAt(left++);
				if(d == ch)
					window.put(d, window.getOrDefault(d, 0) - 1);
			}
			ans = Math.max(ans, right - left);
		}
		return ans;
	}
}