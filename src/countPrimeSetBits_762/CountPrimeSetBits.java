package countPrimeSetBits_762;

public class CountPrimeSetBits {
    public static void main(String[] args) {
        int left = 6, right = 10;
        System.out.println(new Solution().countPrimeSetBits(left,right));
    }
}
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++){
            //Integer.bitCount(i)将十进制转为二进制
            if (isPrime(Integer.bitCount(i)))
                ans ++;
        }
        return ans;
    }
    boolean isPrime(int cnt){
        if (cnt < 2)
            return false;
        for (int i = 2; i <= cnt / 2; i++){
            if (cnt % i == 0){
                return false;
            }
            if (i > cnt / 2)
                return true;
        }
        return true;
    }
}