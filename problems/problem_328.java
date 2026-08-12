
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

public class problem_328 {

    // O(N) -- solution 
    // public static ListNode oddEvenList(ListNode head) {
    //     if (head == null || head.next == null || head.next.next == null) {
    //         return head;
    //     }
    //     ListNode current = head;
    //     int idx = 1;
    //     // creating new linked list 1
    //     ListNode outputOdd = new ListNode();
    //     ListNode outputEven = new ListNode();
    //     ListNode oddHead = outputOdd;
    //     ListNode evenHead = outputEven;
    //     while (current != null) {
    //         if (idx % 2 != 0) {
    //             outputOdd.val = current.val;
    //             idx++;
    //             if (current.next != null && current.next.next != null) {
    //                 outputOdd.next = new ListNode();
    //                 outputOdd = outputOdd.next;
    //             }
    //         } else {
    //             outputEven.val = current.val;
    //             idx++;
    //             if (current.next != null && current.next.next != null) {
    //                 outputEven.next = new ListNode();
    //                 outputEven = outputEven.next;
    //             }
    //         }
    //         current = current.next;
    //     }
    //     outputOdd.next = evenHead;
    //     return oddHead;
    // }
    // O(1) -- solution 
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        ListNode result = oddEvenList(head);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
