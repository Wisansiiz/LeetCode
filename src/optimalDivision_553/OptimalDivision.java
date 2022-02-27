/**
 * 
 */
package optimalDivision_553;
/**
 * @author Wisansiiz
 *给定一组正整数，相邻的整数之间将会进行浮点除法操作。
 *例如， [2,3,4] -> 2 / 3 / 4 。

但是，你可以在任意位置添加任意数目的括号，来改变算数的优先级。
你需要找出怎么添加括号，才能得到最大的结果，
并且返回相应的字符串格式的表达式。你的表达式不应该含有冗余的括号。

 */
public class OptimalDivision {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {1000,100,10,2};
		System.out.print(new Solution().optimalDivision(nums));
	}

}
class Solution {
    public String optimalDivision(int[] nums) {
        StringBuffer res = new StringBuffer();
        int n = nums.length;
        res.append(nums[0]);
        //如果只有两位数则不需要加括号
        if(n == 2)
        {
        	res.append("/");
        	res.append(nums[1]);
        }
        //两位数以上只需把后面都加括号
        else if(n > 2)
        {
        	res.append("/(");
            for(int i = 1; i < n; i++)
            {
            	if(i != 1)
            		res.append("/");
            	res.append(nums[i]);
            }
            res.append(")");
        }
        return res.toString();
    }
}
