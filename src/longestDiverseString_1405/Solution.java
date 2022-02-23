package longestDiverseString_1405;

/**
 * @author Wisansiiz
 *如果字符串中不含有任何 'aaa'，'bbb' 或 'ccc' 
 *这样的字符串作为子串，那么该字符串就是一个「快乐字符串」。
给你三个整数 a，b ，c，请你返回 任意一个 满足下列全部条件的字符串 s：
s 是一个尽可能长的快乐字符串。
s 中 最多 有a 个字母 'a'、b 个字母 'b'、c 个字母 'c' 。
s 中只含有 'a'、'b' 、'c' 三种字母。
如果不存在这样的字符串 s ，请返回一个空字符串 ""。
 */
class Solution {
    public String longestDiverseString(int a, int b, int c) {
    	String str = "";
    	while(true)
    	{
    		if(a >= b && a >= c && isdouble(str))
        	{
        		str = adda(str);
        		a--;
        	}
        	else if(b >= a && b >= c && isdouble(str))
        	{
        		str = addb(str);
        		b--;
        	}
        	else if(c >= a && c >= b && isdouble(str))
        	{
        		str = addc(str);
        		c--;
        	}
        	else if(!isdouble(str))
        	{
        		if(a >= b && a <= c)
        		{
        			str = adda(str);
        			a--;
        		}
        		else if(b >= a && b <= c)
        		{
        			str = addb(str);
        			b--;
        		}
        		else
        		{
        			str = addc(str);
        			c--;
        		}
        	}
    		if((a == 0 && b == 0 && !isdouble(str)) || (a == 0 && c == 0 && !isdouble(str) || (c == 0 && b == 0 && !isdouble(str))))
    			break;
    	}
    	return str;
    }
    String adda(String str)
    {
    	str += 'a';
    	return str;
    }
    String addb(String str)
    {
    	str += 'b';
    	return str;
    }
    String addc(String str)
    {
    	str += 'c';
    	return str;
    }
    boolean isdouble(String str)
    {
    	boolean flag = true;
    	if(str.length() > 1 && str.charAt(str.length()-2) == (str.charAt(str.length()-1)))
    		flag = false;
    	return flag;
    }
}
