/**
 * 
 */
package countKDifference;

/**
 * @author Wisansiiz
 *
 */
class Solution2 {
    public int countKDifference(int[] nums, int k) {
        int[] hash = new int[101];
        for (int num : nums) hash[num]++;
        for (int i = 1; i + k < 101; i++) hash[0] += hash[i] * hash[i + k];
        return hash[0];
    }
}
