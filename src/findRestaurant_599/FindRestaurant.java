package findRestaurant_599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRestaurant {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String [] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String [] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		System.out.print(new Solution().findRestaurant(list1, list2));
	}

}
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int n = list1.length, m = list2.length;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) map.put(list1[i], i);
        List<String> ans = new ArrayList<>();
        int min = 3000;
        for (int i = 0; i < m; i++) {
            String s = list2[i];
            if (!map.containsKey(s)) continue;
            if (i + map.get(s) < min) {
                ans.clear();
                min = i + map.get(s);
                ans.add(s);
            } else if (i + map.get(s) == min) {
                ans.add(s);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}