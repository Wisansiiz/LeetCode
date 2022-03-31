package selfDividingNumbers_728;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 9, right = 22;
        System.out.println(new Solution().selfDividingNumbers(left, right));
    }
}
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        T:
        for(int i = left; i <= right; i++){
            int j = i;
            while (j > 0){
                int n = j % 10;
                j = j / 10;
                if(n == 0 || i % n != 0)
                    continue T;
            }
            ans.add(i);
        }
        return ans;
    }
}