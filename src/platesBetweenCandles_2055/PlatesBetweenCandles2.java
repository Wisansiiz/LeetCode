package platesBetweenCandles_2055;

public class PlatesBetweenCandles2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "**|**|***|";
		int[][] queries = { { 2, 5 }, { 5, 9 } };
		int[] arr = new Solution2().platesBetweenCandles(s, queries);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}

class Solution2 {
	public int[] platesBetweenCandles(String s, int[][] queries) {
		int n = s.length(), len = queries.length;
		int[] sum = new int[n];
		int su = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '*') {
				su++;
			}
			sum[i] = su;
		}
		int [] ans = new int [len];
		return ans;
		
	}
}