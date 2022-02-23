/**
 * 
 */
package isOneBitCharacter;

/**
 * @author Wisansiiz
 *有两种特殊字符：

第一种字符可以用一个比特 0 来表示
第二种字符可以用两个比特(10 或 11)来表示、
给定一个以 0 结尾的二进制数组 bits ，
如果最后一个字符必须是一位字符，则返回 true 。
 */
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
    	int n = bits.length, i = 0;
    	while(i < n - 1)
    	{
    		if(bits[i] == 0)
    			i ++;
    		if(bits[i] == 1)
    			i += 2;
    	}
    	return i == n - 1;
    }
}
