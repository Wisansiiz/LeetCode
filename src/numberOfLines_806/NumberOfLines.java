package numberOfLines_806;

import java.util.Arrays;

public class NumberOfLines {
    public static void main(String[] args) {
        int[] widths = {3,4,10,4,8,7,3,3,4,9,8,2,9,6,2,8,4,9,9,10,2,4,9,10,8,2};
        String s = "mqblbtpvicqhbrejb";
        System.out.println(Arrays.toString(new Solution().numberOfLines(widths, s)));
    }
}
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int [] ans = new int[2];
        ans[0]++;
        int res = 0;
        for (char c : s.toCharArray()){
            int tem = widths[c - 'a'];
            if (res + tem <= 100) {
                res += tem;
                ans[1] = res;
                continue;
            }
            ans[0]++;
            res = 0;
            res += tem;
            ans[1] = res;
        }
        return ans;
    }
}