package ｍinWindoｗ_76;

import java.util.HashMap;

public class MinWindow {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "ADOBECODEBANC";
		String t = "ABC";
		System.err.println(new Solution().minWindow(s, t));
	}

}
class Solution {
    public String minWindow(String s, String t) {
    	HashMap<Character, Integer> need = new HashMap<>();
    	HashMap<Character, Integer> window = new HashMap<>();
    	for (int i = 0; i < t.length(); i++) {
    		//获取指定的key对应的 value 如果找不到key 则返回设置的默认值
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int left = 0, right = 0;
        int valid = 0;
        // 记录最小覆盖子串的起始索引及长度
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            // c 是将移入窗口的字符
            char c = s.charAt(right);
            // 右移窗口
            right++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(c)) {
            	//将当前char c 存入对应的window位置
            	window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }

            // 判断左侧窗口是否要收缩
            while (valid == need.size()) {
                // 在这里更新最小覆盖子串
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // d 是将移出窗口的字符
                char d = s.charAt(left);
                // 左移窗口
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d,window.getOrDefault(d,0)-1);
                }                    
            }
        }
        // 返回最小覆盖子串
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}