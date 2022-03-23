package winnerOfGame_2038;

public class WinnerOfGame {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String colors = "AAABABB";
		System.out.println(new Solution().winnerOfGame(colors));
	}

}

class Solution {
	public boolean winnerOfGame(String colors) {
		int a = 0, b = 0;
		int len = colors.length();
		for (int i = 1; i < len - 1; i++) {
			if (colors.charAt(i) == 'A' && colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A')
				a++;
			if (colors.charAt(i) == 'B' && colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B')
				b++;
		}
		if (a > b)
			return true;
		return false;
	}
}