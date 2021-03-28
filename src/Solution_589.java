import DataStructure.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution_589 {
    public List<Integer> preorder(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();

        if(root==null){
            return res;
        }

        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollFirst();
            res.addLast(node.val);
            Collections.reverse(node.children);
            for (Node n:node.children
                 ) {
                if(n!=null){
                    stack.push(n);
                }
            }
        }
        return res;
    }
}
