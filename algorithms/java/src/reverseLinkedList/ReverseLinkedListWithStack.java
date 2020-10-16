package reverseLinkedList;

import java.util.Stack;

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseLinkedListWithStack {

    public ListNode reverseList(ListNode head) {

        if(head == null) {
            return null;
        }

        Stack<ListNode> stack = new Stack<ListNode>();
        while(head != null) {
            stack.push(head);
            head = head.next;
        }

        ListNode last = null;
        while(!stack.isEmpty()) {
            if(head == null) {
                head = stack.pop();
                last = head;
            } else {
                last.next = stack.pop();
                last = last.next;
            }
        }
        last.next = null;
        return head;
    }
}
