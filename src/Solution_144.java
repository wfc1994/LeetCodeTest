import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 前序遍历
 */
public class Solution_144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        digui(root,res);
        return res;
    }

    public void digui(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        if(root.left!=null){
            digui(root.left,res);
        }
        if(root.right!=null){
            digui(root.right,res);
        }
    }
}
