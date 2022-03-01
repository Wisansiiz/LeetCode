package convert_6;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AB";
				//"PAYPALISHIRING";
		int numRows = 1;
		System.out.print(new Solution().convert(s, numRows));
	}

}
class Solution {
    public String convert(String s, int numRows) {
    	StringBuilder ans = new StringBuilder();
    	int n = numRows, m = 2 * n - 2;
    	if(numRows == 1)
    		return s;
    	for(int j = 0; j < numRows; j++)
    	{
    		
    		for(int i = 0; i < s.length(); i++)
    		{
        		if(i % m == j || i % m == j + 2 * n - 2)
        			ans.append(s.charAt(i));
    		}
    		n--;
    	}
    	return ans.toString();
    }
}