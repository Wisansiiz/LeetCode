package goodDaysToRobBank_2100;

import java.util.ArrayList;
import java.util.List;

public class Answer
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		int[] security =
				// { 1, 2, 3, 4, 5, 6 };
				// {4,3,2,1};
				{ 1, 2, 5, 4, 1, 0, 2, 4, 5, 3, 1, 2, 4, 3, 2, 4, 8 };
		int time = 2;
		System.out.print(new Solution2().goodDaysToRobBank(security, time));
	}

}

class Solution2
{
	public List<Integer> goodDaysToRobBank(int[] security, int time)
	{
		int n = security.length;
		int[] left = new int[n];
		int[] right = new int[n];
		for (int i = 1; i < n; i++)
		{
			if (security[i] <= security[i - 1])
			{
				left[i] = left[i - 1] + 1;
			}
			if (security[n - i - 1] <= security[n - i])
			{
				right[n - i - 1] = right[n - i] + 1;
			}
		}

		List<Integer> ans = new ArrayList<>();
		for (int i = time; i < n - time; i++)
		{
			if (left[i] >= time && right[i] >= time)
			{
				ans.add(i);
			}
		}
		return ans;
	}
}