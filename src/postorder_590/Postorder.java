package postorder_590;

import java.util.*;

public class Postorder {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        HouXu(root, ans);
        return ans;
    }
    void HouXu(Node root, List<Integer> ans){
    	if(root == null)
    		return ;
    	for(Node node : root.children) {
    		HouXu(node, ans);
    	}
    	ans.add(root.val);
    }
}