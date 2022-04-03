package nextGreatestLetter_744;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'a','b'};
        char target = 'z';
        System.out.println(new Solution().nextGreatestLetter(letters, target));
    }
}
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        if (letters[0] > target)
            return letters[0];
        int i = 0;
        for (; i < n - 1; i++){
            if (letters[i] <= target && letters[i + 1] > target){
                return letters[i + 1];
            }
        }
        if (i == n - 1)
            return letters[0];
        return 0;
    }
}