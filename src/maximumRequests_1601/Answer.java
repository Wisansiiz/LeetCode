/**
 * 
 */
package maximumRequests_1601;

import java.util.Arrays;

/**
 * @author Wisansiiz
 *
 */
public class Answer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 5;
		int[][] requests = {{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}};
		System.out.print(new Solution1().maximumRequests(n, requests));
	}

}
class Solution1 {
    public int maximumRequests(int n, int[][] requests) {
        int[] delta = new int[n];
        int ans = 0, m = requests.length;
        for (int mask = 0; mask < (1 << m); ++mask) {
            int cnt = Integer.bitCount(mask);
            if (cnt <= ans) {
                continue;
            }
            Arrays.fill(delta, 0);
            for (int i = 0; i < m; ++i) {
                if ((mask & (1 << i)) != 0) {
                    ++delta[requests[i][0]];
                    --delta[requests[i][1]];
                }
            }
            boolean flag = true;
            for (int x : delta) {
                if (x != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans = cnt;
            }
        }
        return ans;
    }
}