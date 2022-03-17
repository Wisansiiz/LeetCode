package longestWord_720;

import java.util.HashSet;
import java.util.Set;

public class Answer {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String [] words = {"w","wo","wor","worl", "world"};
		System.out.print(new Solution().longestWord(words));
	}

}
class Solution {
    public String longestWord(String[] words) {
    	Set<String> set = new HashSet<>();
    	String ans = "";
    	for(String s : words)
    		set.add(s);
    	for(String s : set) {
    		int n = s.length(), m = ans.length();
    		if(n < m) continue;
    		if(n == m && s.compareTo(ans) > 0) continue;
    		boolean flag = true;
    		for(int i = 1; i<= n && flag; i++) {
    			String sub = s.substring(0, i);
    			if(!set.contains(sub)) flag = false;
    		}
    		if(flag) ans = s;
    	}
    	return ans;
    }
}