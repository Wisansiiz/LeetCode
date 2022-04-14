package maximumWealth_1672;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(new Solution().maximumWealth(accounts));
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            if (sum(account) > max)
                max = sum(account);
            //max = Math.max(max, Arrays.stream(account).sum());
        }
        return max;
    }

    //Arrays.stream(account).sum();
    int sum(int[] account) {
        int s = 0;
        for (int i : account) {
            s += i;
        }
        return s;
    }
}