package minWindow_76;

import java.util.HashMap;

public class MinWindow {
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
    		//��ȡָ����key��Ӧ�� value ����Ҳ���key �򷵻����õ�Ĭ��ֵ
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int left = 0, right = 0;
        int valid = 0;
        // ��¼��С�����Ӵ�����ʼ����������
        int start = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            // c �ǽ����봰�ڵ��ַ�
            char c = s.charAt(right);
            // ���ƴ���
            right++;
            // ���д��������ݵ�һϵ�и���
            if (need.containsKey(c)) {
            	//����ǰchar c �����Ӧ��windowλ��
            	window.put(c,window.getOrDefault(c,0)+1);
                if (window.get(c).equals(need.get(c)))
                    valid++;
            }

            // �ж���ര���Ƿ�Ҫ����
            while (valid == need.size()) {
                // �����������С�����Ӵ�
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // d �ǽ��Ƴ����ڵ��ַ�
                char d = s.charAt(left);
                // ���ƴ���
                left++;
                // ���д��������ݵ�һϵ�и���
                if (need.containsKey(d)) {
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d,window.getOrDefault(d,0)-1);
                }                    
            }
        }
        // ������С�����Ӵ�
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}