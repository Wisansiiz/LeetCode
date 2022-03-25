package trailingZeroes_172;

public class TrailingZeroes {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 125;
		System.out.println(new Solution().trailingZeroes(n));
	}

}
class Solution {
    public int trailingZeroes(int n) {
		int res = 0;
		int ans = 5;
		while(ans <= n) {
			res += n/ans;
			ans *= 5;
		}
    	return res;
    }
}