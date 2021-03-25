import DataStructure.TreeNode;

public class Solution_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }
        TreeNode treeNode = new TreeNode(t1.val + t2.val);
        treeNode.left = mergeTrees(t1.left,t2.left);
        treeNode.right = mergeTrees(t1.right,t2.right);
        return treeNode;
    }
}
