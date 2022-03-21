package findTarget_653;

import java.util.HashSet;
import java.util.Set;

public class FindTarget {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Solution {
	Set<Integer> set = new HashSet<>();

	public boolean findTarget(TreeNode root, int k) {
		if (root == null)
			return false;
		if (set.contains(k - root.val))
			return true;
		set.add(root.val);
		return findTarget(root.left, k) || findTarget(root.right, k);
	}
}