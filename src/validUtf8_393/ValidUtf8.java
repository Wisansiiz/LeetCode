package validUtf8_393;

public class ValidUtf8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] data = {255};
		System.out.print(new Solution().validUtf8(data));
	}

}

class Solution {
	public boolean validUtf8(int[] data) {
		int n = data.length;
		for (int i = 0; i < n; ) {
			int num = data[i], cnt = 0;
			for (int j = 7; j >= 0; j--) {
				if ((((num >> j) & 1) != 1)) {
					cnt = 7 - j;
					break;
				}
				if(j == 0) cnt = 7;
			}
			if(cnt > 4 || cnt == 1) return false;
			if (i + cnt - 1 >= n) return false;
			for(int k = i + 1; k < i + cnt; k++) {
				if ((((data[k] >> 7) & 1) == 1) && (((data[k] >> 6) & 1) == 0)) 
					continue;
				return false;
			}
			if(cnt == 0) i++;
			else i+= cnt;
		}
		return true;
	}
}