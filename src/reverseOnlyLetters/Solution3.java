/**
 * 
 */
package reverseOnlyLetters;

/**
 * @author Wisansiiz
 *
 */
class Solution3 {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int left = 0, right = n - 1;
        while (true) {
            while (left < right && !Character.isLetter(s.charAt(left))) { // ÅÐ¶Ï×ó±ßÊÇ·ñÉ¨Ãèµ½×ÖÄ¸
                left++;
            }
            while (right > left && !Character.isLetter(s.charAt(right))) { // ÅÐ¶ÏÓÒ±ßÊÇ·ñÉ¨Ãèµ½×ÖÄ¸
                right--;
            }
            if (left >= right) {
                break;
            }
            swap(arr, left, right);
            left++;
            right--;
        }
        return new String(arr);
    }

    public void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
