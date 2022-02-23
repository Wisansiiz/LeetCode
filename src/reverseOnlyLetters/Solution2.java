/**
 * 
 */
package reverseOnlyLetters;

/**
 * @author Wisansiiz
 *
 */
class Solution2 {
    public String reverseOnlyLetters(String s) {
    	int n = s.length(), i = 0, j = n - 1;
    	String str = "";
    	String res = "";
    	for(; j > -1; j--)
    	{
    		if(Character.isLetter(s.charAt(j)))
    			str += s.charAt(j);
    	}
    	int k = 0;
    	for(; i < n; i++)
    	{
    		if(!Character.isLetter(s.charAt(i)))
    			res += s.charAt(i);
    		else
    		{
    			res += str.charAt(k);
    			k++;
    		}
    	}
    	return res;
    }
}
