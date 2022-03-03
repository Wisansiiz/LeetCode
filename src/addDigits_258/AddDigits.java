package addDigits_258;

public class AddDigits {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 1;
		System.out.print(new Solution().addDigits(num));
	}

}
class Solution {
    public int addDigits(int num) {
    	if(num / 10 == 0)
    		return num;
    	return s(num);
    }
    int sum = 0;
    int s(int num)
    {
    	
    	if(num < 10)
    		return sum;
    	sum = 0;
    	while(num != 0)
    	{
    		sum += num % 10;
    		num /= 10;
    	}
    	return s(sum);
    }
}