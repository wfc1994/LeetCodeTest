import DataStructure.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution_590 {
    //递归法
//    public List<Integer> postorder(Node root) {
//        List<Integer> res = new ArrayList<>();
//        digui(root,res);
//        return res;
//    }
//
//    public void digui(Node root,List<Integer> res){
//        if(root==null){
//            return;
//        }
//
//        if(root.children!=null){
//            for (Node c:root.children
//                 ) {
//                digui(c,res);
//            }
//        }
//        res.add(root.val);
//    }

    //迭代法
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if(root!=null){
            stack.add(root);
        }else {
            return null;
        }

        while(!stack.isEmpty()){
            Node node = stack.pollFirst();
            res.add(node.val);
            for (Node n:node.children
                 ) {
                if(n!=null){
                    stack.addFirst(n);
                }
            }
        }
        return res;
    }
}
