
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

public class problem_2181 {

    public ListNode mergeNodes(ListNode head) {
        ListNode current = head.next;
        int sum = 0;

        // creating new linked list
        ListNode output = new ListNode();
        ListNode result = output;

        while (current != null) {
            if (current.val != 0) {
                sum += current.val;
            }
            if (current.val == 0) {
                output.val = sum;
                sum = 0;

                if (current.next != null) {
                    output.next = new ListNode();
                    output = output.next;
                }

            }
            current = current.next;
        }
        return result;
    }
}
