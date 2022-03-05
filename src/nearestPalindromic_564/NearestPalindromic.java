package nearestPalindromic_564;

public class NearestPalindromic {
/*
 * 给定一个表示整数的字符串 n ，
 * 返回与它最近的回文整数（不包括自身）。
 * 如果不止一个，返回较小的那个。

“最近的”定义为两个整数差的绝对值最小。
 * */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String n = "100";
		System.out.print(new Solution2().nearestPalindromic(n));
	}

}
class Solution2 {
    public String nearestPalindromic(String n) {
    	StringBuilder sb = new StringBuilder();
    	String ans = near(sb, n), res = "";
    	long num = Long.valueOf(n), min = Long.MAX_VALUE;
    	if(n.length() == 1 && num != 0)
    		return (num - 1)+"";
    	if(num == Math.pow(10, n.length()-1))
    		return (num - 1)+"";
    	if(!ans.equals(n))
    	{
    		long dif = Math.abs(Long.valueOf(ans) - num);
    		String num1 = near(sb, (long) (num - Math.pow(10, n.length()/2))+"");
    		long dif1 = Math.abs(Long.valueOf(num) - Long.valueOf(num1));
    		String num2 = near(sb, (long) (num + Math.pow(10, n.length()/2))+""); 
    		long dif2 = Math.abs(Long.valueOf(num) - Long.valueOf(num2));
    		long tem = dif < dif1 ? dif:dif1;
    		String tem1 = dif < dif1 ? ans : num1;
    		long tem2 = tem < dif2 ? tem : dif2;
    		ans = tem <= tem2 ? tem1 : num2;
    	}
    	else
    	{
    		for(long i = (long) (num - Math.pow(10, n.length()/2)) - 1; i < (long) (num + Math.pow(10, n.length()/2)); i++)
    		{
    			if((i+"").length() == 1 && (i + 1 + "").length() == 2)
    			{
    				ans = i+"";
    				break;
    			}
    			ans = near(sb, i+"");
    			if(!ans.equals(n))
    			{
    				if(Math.abs(Long.valueOf(ans) - num) < min)
    				{
    					min = Math.abs(Long.valueOf(ans) - num);
    					res = ans;
    				}
    			}
    			ans = res;
    		}
    	}
    	return ans;
    }
    String near(StringBuilder sb, String n)
	{
		int i = 0;
		long len = n.length();
		for (; i < len / 2; i++) 
			sb.append(n.charAt(i));
		if (len % 2 == 0)
			i--;
		for (; i >= 0; i--) 
			sb.append(n.charAt(i));
		String s = sb.toString();
		sb.delete(0, sb.length());
		return s;
	}
}