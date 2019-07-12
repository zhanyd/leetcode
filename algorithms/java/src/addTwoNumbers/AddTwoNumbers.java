package addTwoNumbers;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 示例：

 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 输出：7 -> 0 -> 8
 原因：342 + 465 = 807

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/add-two-numbers
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        ListNode l3;
        int carryBit = 0;
        while(l1 != null || l2 != null) {
            l3 = new ListNode(0);
            l3.val = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carryBit;
            carryBit = 0;
            if(l3.val >= 10){
                l3.val = l3.val % 10;
                carryBit++;
            }

            if(head == null) {
                head = l3;
                tail = head;
            } else {
                tail.next = l3;
                tail = tail.next;
            }

            if(l1 != null) {
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }

        }

        if(carryBit > 0) {
            tail.next = new ListNode(carryBit);
        }
        return head;
    }
}
