
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class problem_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        int counter = 1;
        int count = 0;

        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode beforeLeft;
        ListNode onLeft;

        while (current != null && counter < left) {
            prev = current;
            current = current.next;
            counter++;
        }
        beforeLeft = prev;
        onLeft = current;

        while (count < (right - left + 1) && current != null) {
            ListNode next_node = current.next;
            current.next = prev;
            prev = current;
            current = next_node;
            count++;
        }

        onLeft.next = current;
        if (beforeLeft != null) {
            beforeLeft.next = prev;
        } else {
            head = prev;
        }

        return head;
    }
}
