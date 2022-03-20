package ListTable;

import javax.swing.plaf.IconUIResource;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * 添加虚节点方式
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements1(ListNode head , int val){
        if(head==null){
            return head;
        }
        ListNode dummy= new ListNode(-1,head);
        ListNode pre = dummy;
        ListNode cur = head;
        while(cur!=null){
            if(cur.val == val){
                pre.next = cur.next;
            }else pre=cur;
            cur = cur.next;
        }
        return dummy.next;
    }
    /**
     * 添加虚节点方式
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements2(ListNode head , int val){
        while(head!=null&head.val==val){
            head = head.next;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur!=null){
            if (cur.val==val){
                pre.next=cur.next;
            }else pre = next;
            cur = cur.next;
        }
        return head;
    }
}
    /*在链表类中实现这些功能：

get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。
如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。*/

class MyLinkList{
    int size;
    ListNode head;
//    初始化链表
    public MyLinkList(){
        size = 0;
        head = new ListNode(0);
    }

    //获取第index个节点的数值
    public int get(int index){
        //如果index非法，返回-1
        if(index<0||index>=size){
            return -1;
        }
        ListNode cur = head;
        //包含一个虚拟头节点，所以查找第 index+1 个节点
        for (int i = 0; i <= index; i++) {
            cur=cur.next;
        }
        return cur.val;
    }
    //在链表最前面插入一个节点
    public void addAtHead(int val){
        addAtIndex(0,val);
    }

    public void addAtTail(int val){
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        ListNode one = new ListNode(val);
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur=cur.next;
        }
        one.next=cur.next;
        cur.next=one;
    }
     //删除第index个节点
     public void deleteAtIndex(int index){
         if (index < 0 || index >= size) {
             return;
         }
         size--;
         ListNode pred = head;
         for (int i = 0; i < index; i++) {
             pred = pred.next;
         }
         pred.next = pred.next.next;

     }



}

//双链表
class MyLinkedList {
    class ListNode {
        int val;
        ListNode next,prev;
        ListNode(int x) {val = x;}
    }

    int size;
    ListNode head,tail;//Sentinel node

    /** Initialize your data structure here. */
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || index >= size){return -1;}
        ListNode cur = head;

        // 通过判断 index < (size - 1) / 2 来决定是从头结点还是尾节点遍历，提高效率
        if(index < (size - 1) / 2){
            for(int i = 0; i <= index; i++){
                cur = cur.next;
            }
        }else{
            cur = tail;
            for(int i = 0; i <= size - index - 1; i++){
                cur = cur.prev;
            }
        }
        return cur.val;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode cur = head;
        ListNode newNode = new ListNode(val);
        newNode.next = cur.next;
        cur.next.prev = newNode;
        cur.next = newNode;
        newNode.prev = cur;
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode cur = tail;
        ListNode newNode = new ListNode(val);
        newNode.next = tail;
        newNode.prev = cur.prev;
        cur.prev.next = newNode;
        cur.prev = newNode;
        size++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > size){return;}
        if(index < 0){index = 0;}
        ListNode cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = cur.next;
        cur.next.prev = newNode;
        newNode.prev = cur;
        cur.next = newNode;
        size++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >= size || index < 0){return;}
        ListNode cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        cur.next.next.prev = cur;
        cur.next = cur.next.next;
        size--;
    }
}
