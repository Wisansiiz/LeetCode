package missingRolls_2028;

import java.util.Arrays;

public class MissingRolls {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] rolls = { 4,2,2,5,4,5,4,5,3,3,6,1,2,4,2,1,6,5,4,2,3,4,2,3,3,5,4,1,4,4,5,3,6,1,5,2,3,3,6,1,6,4,1,3};
		int mean = 2, n = 53;
		int[] arr = new Solution().missingRolls(rolls, mean, n);
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.println(arr[i]);
		}
	}

}

class Solution {
	public int[] missingRolls(int[] rolls, int mean, int n) {
		int[] ans = new int[n];
		int sum = 0, m = rolls.length;
		for (int i : rolls)
			sum += i;
		if ((n + sum) / (n + m * 1.0) > mean || (6 * n + sum) / (n + m * 1.0) < mean)
			return new int[0];//比较浮点数的大小,不存在则返回空
		int cnt = m + n;
		int left = mean * cnt - sum;//数学公式后剩余的值
		int zhengshu = left / n;//整数部分
		Arrays.fill(ans, zhengshu);
		int yushu = left % n;//余数部分
		if(yushu != 0) {
			for(int i = 0; i < n && yushu > 0; i++) {
				if(yushu + zhengshu <= 6) {
					ans[i] = zhengshu + yushu;
					break;
				}
				/*如果此时余数+整数的值不足6则ans[i]不足6
				*则可以直接返回值后退出
				*/
				yushu -= (6 - zhengshu);
				ans[i] = ans[i] +  (6 - zhengshu);
			}
		}
		return ans;
	}
}