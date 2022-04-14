package RandomizedSet_380;

import java.util.*;

class RandomizedSet {
    List<Integer> nums;
    Map<Integer,Integer> map;
    Random random;

    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        int len = nums.size();
        nums.add(val);
        map.put(val,len);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int n = map.get(val);
        int lastlen = nums.get(nums.size() - 1);
        nums.set(n, lastlen);
        map.put(lastlen,n);
        nums.remove(nums.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int rand = random.nextInt(nums.size());
        return nums.get(rand);
    }
}