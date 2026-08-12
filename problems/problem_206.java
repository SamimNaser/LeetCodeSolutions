
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

public class problem_206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next_node = current.next; // save the rest of the list
            current.next = prev;               // reverse the pointer
            prev = current;                    // move prev forward
            current = next_node;               // move current forward
        }
        return prev;
    }
}
