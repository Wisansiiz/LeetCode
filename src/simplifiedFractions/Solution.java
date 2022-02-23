/**
 * 
 */
package simplifiedFractions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author W
 *
 */
class Solution {
    public List<String> simplifiedFractions(int n) {
    	List<String> ans = new ArrayList<String>();
    	for(int i = 2; i <= n; i++)
    	{
    		for(int j = 1; j < i; j++)
    		{
    			if(gcd(i, j) == 1)
    				ans.add(j + "/" + i);
    		}
    	}
    	return ans;
    }
    public int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }//求最大公约数
}
