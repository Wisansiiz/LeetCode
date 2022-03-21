package longestWord_720;

import java.util.HashSet;
import java.util.Set;

public class LongestWord {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String [] words = {"w","wo","wor","worl", "world"};
		System.out.print(new Solution2().longestWord(words));
	}

}
class Solution2 {
    public String longestWord(String[] words) {
    	Set<String> set = new HashSet<>();
    	String ans = "";
    	for(String s : words)
    		set.add(s);
    	StringBuilder sb = new StringBuilder();
    	for(String s : set)
    		if(s.length() == 1)
        		sb.append(s);
    	for(int i = 0; i < sb.length(); i++) {
    		
    	}
    	return ans;
    }
}