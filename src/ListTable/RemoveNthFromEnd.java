package ListTable;

public class RemoveNthFromEnd {
    /*给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。*/

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode slow = dummy;
            ListNode fast = dummy;
            while (n-- > 0) {
                fast = fast.next;
            }
            // 记住 待删除节点slow 的上一节点
            ListNode prev = null;
            while (fast != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next;
            }
            // 上一节点的next指针绕过 待删除节点slow 直接指向slow的下一节点
            prev.next = slow.next;
            // 释放 待删除节点slow 的next指针, 这句删掉也能AC
            slow.next = null;

            return dummy.next;
        }

}
