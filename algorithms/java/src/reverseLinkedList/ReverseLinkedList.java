package reverseLinkedList;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(head != null) {
            head = head.next;
            curr.next = prev;
            prev = curr;
            curr = head;
        }
        return prev;
    }
}
