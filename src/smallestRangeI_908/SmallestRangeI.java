package smallestRangeI_908;

public class SmallestRangeI {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6};
        int k = 3;
        System.out.println(new Solution().smallestRangeI(nums,k));
    }
}
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        if (min + k < max - k)
            return max - min - 2 * k;
        else return 0;
    }
}