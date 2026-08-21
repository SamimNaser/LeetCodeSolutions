
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

public class problem_1669 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count = 0;

        ListNode current = list1;
        ListNode current2 = list2;

        ListNode first;
        ListNode last;

        while (count < a - 1) {
            current = current.next;
            count++;
        }
        first = current;
        while (count < b + 1) {
            current = current.next;
            count++;
        }
        last = current;

        first.next = list2;

        while (current2.next != null) {
            current2 = current2.next;
        }

        current2.next = last;

        return list1;
    }
}
