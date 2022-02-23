/**
 * 
 */
package maxNumberOfBalloons_1189;

/**
 * @author W
 *
 */
class Solution_maxNumberOfBalloons {
	public int maxNumberOfBalloons(String text) {
		char[] arr = "balloon".toCharArray();
		char[] text2 = text.toCharArray();
		int n = arr.length;
		int m = text2.length;
		boolean flag = false;
		int i = 0;
		int res = 0;
		while (true) 
		{	//循环balloon中的字母
			for (i = 0; i < n; i++) 
			{
				for (int j = 0; j < m; j++) 
				{//查找字符串中与单词匹配的字母
					if (arr[i] == text2[j]) 
					{
						flag = true;
						text2[j] = '0';
						break;//找到则退出
					}
					//到末尾依旧没找到
					else if (j == m - 1) 
					{
						flag = false;
						break;
					}
				}
				if (!flag)
					break;
			}
			//查找一次完毕
			if (i == n)
				res++;
			if (!flag)
				break;
		}
		return res;
	}
}
