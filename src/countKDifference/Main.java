package countKDifference;

public class Main {

	public static void main(String[] args) {
//		给你一个整数数组 nums 和一个整数 k ，
//		请你返回数对 (i, j) 的数目，满足 i < j 且 
//		|nums[i] - nums[j]| == k 。
//
//				|x| 的值定义为：
//
//				如果 x >= 0 ，那么值为 x 。
//				如果 x < 0 ，那么值为 -x 。
		// TODO 自动生成的方法存根
		int[] arr = {3,2,1,5,4};
		System.out.println(new Solution2().countKDifference(arr, 2));
	}

}
