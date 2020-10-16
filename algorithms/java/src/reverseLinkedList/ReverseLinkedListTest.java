package reverseLinkedList;

import org.junit.jupiter.api.Test;

public class ReverseLinkedListTest {

    @Test
    public void test(){
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        printListNode(node1);
        ListNode reverseNode = reverseLinkedList.reverseList(node1);
        printListNode(reverseNode);

        node1 = null;
        printListNode(node1);
        reverseNode = reverseLinkedList.reverseList(node1);
        printListNode(reverseNode);
    }

    private void printListNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
