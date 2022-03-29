package lengthOfLongestSubstring_3;

import java.util.HashMap;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "abcabcbb";
		System.out.println(new Solution().lengthOfLongestSubstring(s));
	}

}

class Solution {
	public int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> window = new HashMap<>();
		int left = 0, right = 0;
		int ans = 0;
		while(right < s.length()) {
			char c = s.charAt(right);
			right++;
			window.put(c,window.getOrDefault(c,0)+1);
			//�ж�����Ƿ�����
			while(window.get(c) > 1) {
				char d = s.charAt(left);
				left++;
				window.put(d, window.getOrDefault(d, 0) - 1);
			}
			ans = Math.max(ans, right - left);
		}
		return ans;
	}
}