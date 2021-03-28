import DataStructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;


/**
 * 173. 二叉搜索树迭代器
 * 实现一个二叉搜索树迭代器类BSTIterator ，表示一个按中序遍历二叉搜索树（BST）的迭代器：
 * BSTIterator(TreeNode root) 初始化 BSTIterator 类的一个对象。BST 的根节点 root 会作为构造函数的一部分给出。指针应初始化为一个不存在于 BST 中的数字，且该数字小于 BST 中的任何元素。
 * boolean hasNext() 如果向指针右侧遍历存在数字，则返回 true ；否则返回 false 。
 * int next()将指针向右移动，然后返回指针处的数字。
 * 注意，指针初始化为一个不存在于 BST 中的数字，所以对 next() 的首次调用将返回 BST 中的最小元素。
 *
 * 你可以假设 next() 调用总是有效的，也就是说，当调用 next() 时，BST 的中序遍历中至少存在一个下一个数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search-tree-iterator
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_173 {
    public LinkedList<Integer> node = new LinkedList<>();

    public Solution_173(TreeNode root) {
        digui(root,this.node);
    }

    public void digui(TreeNode root, LinkedList<Integer> node){
        if(root.left!=null){
            digui(root.left,node);
        }
        if(root!=null){
            node.add(root.val);
        }
        if(root.right!=null){
            digui(root.right,node);
        }
    }

    public int next() {
        return this.node.pollFirst();
    }

    public boolean hasNext() {
        if(!this.node.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode4 = new TreeNode(9);
        TreeNode treeNode5 = new TreeNode(20);

        treeNode3.left=treeNode4;
        treeNode3.right=treeNode5;
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;

        Solution_173 solution_173 = new Solution_173(treeNode1);
        int next = solution_173.next();
        System.out.println(next);
        int next1 = solution_173.next();
        System.out.println(next1);
        boolean b1 = solution_173.hasNext();
        System.out.println(b1);
        int next2 = solution_173.next();
        System.out.println(next2);
        boolean b2 = solution_173.hasNext();
        System.out.println(b2);
        int next3 = solution_173.next();
        System.out.println(next3);
        boolean b3 = solution_173.hasNext();
        System.out.println(b3);
        int next4 = solution_173.next();
        System.out.println(next4);
        boolean b4 = solution_173.hasNext();
        System.out.println(b4);

    }

}
