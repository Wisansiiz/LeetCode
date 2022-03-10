package preorder_589;

import java.util.ArrayList;
import java.util.List;

public class Preorder {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Node root = {1,null,3,2,4,null,5,6};
//		System.out.print(new Solution().preorder(root));
	}

}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}

class Solution {
	List<Integer> ans = new ArrayList<>();

	public List<Integer> preorder(Node root) {
		dfs(root);
		return ans;
	}

	void dfs(Node root) {
		if (root == null)
			return;
		ans.add(root.val);
		for (Node node : root.children)
			dfs(node);
	}
}
