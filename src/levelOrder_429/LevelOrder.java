package levelOrder_429;

import java.util.*;

public class LevelOrder {
    public static void main(String[] args) {
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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new LinkedList<>();
        if (root == null)
            return ans;
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int cnt = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < cnt; i++){
                Node res = queue.poll();
                list.add(res.val);
                for (Node child : res.children){
                    queue.offer(child);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}