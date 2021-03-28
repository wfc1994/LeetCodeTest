import DataStructure.ListNode;

/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 */
public class Solution_61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }

        ListNode countNode = head;
        ListNode cur = head;
        int count = 0;
        while(countNode.next!=null){
            count=count+1;
            countNode=countNode.next;
        }
        count = count+1;
        int index = count-k%count;
        if(index==count){
            return head;
        }
        count=0;
        ListNode tail=null;
        while(cur.next!=null){
            count=count+1;
            if(count==index){
                tail = cur.next;
                cur.next = null;
                break;
            }
            cur=cur.next;
        }
        countNode.next = head;


        return tail;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
//        ListNode listNode3 = new ListNode(2);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);

//        listNode2.next = listNode3;
        listNode1.next = listNode2;

        Solution_61 solution_61 = new Solution_61();
        ListNode listNode = solution_61.rotateRight(listNode1,2);

        while(listNode.next!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(listNode.val);
    }
}
