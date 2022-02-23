/**
 * 
 */
package reverseOnlyLetters;

/**
 * @author Wisansiiz
 *
 */
class Solution {
    public String reverseOnlyLetters(String s) {
    	int n = s.length();
    	String str = "";
    	int i = 0, j = n - 1;
    	while(j > -1)
    	{
    		boolean flag = false;
    		if((s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z'))
    		{
    			flag = true;
    			str += s.charAt(j);
    			j--;
    		}
    		if(flag)
    			i++;
    		if(i < n && ((s.charAt(i) < 'A' || s.charAt(i) > 'Z') && (s.charAt(i) < 'a' || s.charAt(i) > 'z')))
			{
				str += s.charAt(i);
				i++;
			}
    		if(!flag)
    			j--;
    	}
		return str;
    }
}