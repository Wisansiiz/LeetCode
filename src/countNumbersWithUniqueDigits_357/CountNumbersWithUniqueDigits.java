package countNumbersWithUniqueDigits_357;

public class CountNumbersWithUniqueDigits {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(new Solution().countNumbersWithUniqueDigits(n));
    }
}
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 10;
        int count = 10;
        int res = 9;
        //排列组合
        for (int i = 0; i < n - 1; i++){
            res *= 9 - i;
            //每位相加,累加
            count += res;
        }
        return count;
    }
}