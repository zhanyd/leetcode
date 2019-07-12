package addTwoNumbers;

import org.junit.jupiter.api.Test;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbersTest(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode resultList = addTwoNumbers.addTwoNumbers(l1,l2);
        while (resultList != null) {
            System.out.println(resultList.val);
            resultList = resultList.next;
        }
    }
}
