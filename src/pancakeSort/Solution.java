/**
 * 
 */
package pancakeSort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author W
 *给你一个整数数组 arr ，请使用 煎饼翻转 完成对数组的排序。

一次煎饼翻转的执行过程如下：

选择一个整数 k ，1 <= k <= arr.length
反转子数组 arr[0...k-1]（下标从 0 开始）
例如，arr = [3,2,1,4] ，选择 k = 3 进行一次煎饼翻转，
反转子数组 [3,2,1] ，得到 arr = [1,2,3,4] 。

以数组形式返回能使 arr 有序的煎饼翻转操作所对应的 k 值序列。
任何将数组排序且翻转次数在 10 * arr.length 范围内的有效答案都将被判断为正确。

 */
class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        // 类似于冒泡，先把最大的换到最后面，再把次大的换到次后面，依次进行
        int n = arr.length;
        // last存储“最后一个位置”（非排好序的最后一位）
        int last = n - 1;
        // x 存储当前轮“最大的数”（非排好序的数中最大的）
        int x = n;
        List<Integer> ans = new ArrayList<Integer>();
        while (x != 1) {
            // 先找到 x 的位置
            int k = 0;
            while (true) {
                if (arr[k] == x) {
                    break;
                }
                k++;
            }
            // k == last 说明 x 已经在“最后一位”了，进入下一轮
            if (k != last) {
                // 把最大的数换到0号位置了，k==0 时不需要交换
                if (k != 0) {
                    reverse(arr, 0, k);
                    ans.add(k + 1);
                }
                // 把最大的数换到“最后一位”
                reverse(arr, 0, last);
                ans.add(last + 1);
            }
            last--;
            x--;
        }
        return ans;
    }

    private void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}
