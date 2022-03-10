package platesBetweenCandles_2055;

public class PlatesBetweenCandles
{

	public static void main(String[] args)
	{
		// TODO 自动生成的方法存根
		String s = "**|**|***|";
		int [][] queries = {{2,5},{5,9}};
		int[] arr = new Solution().platesBetweenCandles(s, queries);
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

}
//超时
class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
    	int len = queries.length;
    	int [] answer = new int [len];
    	for(int i = 0; i < len; i++)
    	{
    		int [] a = {0, 0};
    		boolean left = false, right = false;
    		int l = queries[i][0], r = queries[i][1] ;
    		for(int j = l; j < r; j++)
    		{
    			if(s.charAt(j) == '|')
    			{
    				left = true;
    				a[0] = j;
    				break;
    			}
    		}
    		for(int j = r; j > l; j--)
    		{
    			if(s.charAt(j) == '|')
    			{
    				right = true;
    				a[1] = j;
    				break;
    			}
    		}
    		if(left && right)
    		{
    			for(int k = a[0]; k < a[1]; k++)
    			{
    				if(s.charAt(k) == '*')
    					answer[i]++;
    			}
    		}
    	}
    	return answer;
    }
}