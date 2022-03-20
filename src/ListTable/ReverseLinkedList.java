package ListTable;

public class ReverseLinkedList {
    ListNode head;
    // 双指针
    public ListNode reverse1(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        ListNode one = cur;
        while(cur!=null){
            cur.next = pre;
            pre = cur;
            cur = one.next;
            one = cur;
        }
        return pre;
    }
    // 递归
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }
        ListNode temp = null;
        temp = cur.next;// 先保存下一个节点
        cur.next = prev;// 反转
        // 更新prev、cur位置
        // prev = cur;
        // cur = temp;
        return reverse(cur, temp);
    }

}
