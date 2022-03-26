package calPoints_682;

import java.util.ArrayList;

public class CalPoints {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] ops = {"5","2","C","D","+"};
		System.out.println(new Solution().calPoints(ops));
	}

}
class Solution {
    public int calPoints(String[] ops) {
    	//int n = ops.length;
    	ArrayList<Integer> ans = new ArrayList<>(); 
    	int res = 0;
    	for(String s : ops) {
    		if(s.equals("C"))
    			ans.remove(ans.size() - 1);
    		else if(s.equals("D"))
    			ans.add(ans.get(ans.size() - 1) * 2);
    		else if(s.equals("+"))
    			ans.add(ans.get(ans.size() - 1) + ans.get(ans.size() - 2));
    		else
    			ans.add(Integer.valueOf(s));
    	}
    	for(int i = 0; i < ans.size(); i++)
    		res += ans.get(i);
    	return res;
    }
}