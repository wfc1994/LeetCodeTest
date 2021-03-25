import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历
 */
public class Solution_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        digui(root,res);
        return res;
    }

    public void digui(TreeNode root, List<Integer> res){
        if(root==null){
            return;
        }
        if(root.left!=null){
            digui(root.left,res);
        }
        res.add(root.val);
        if(root.right!=null){
            digui(root.right,res);
        }
    }
}
