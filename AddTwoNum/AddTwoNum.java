package AddTwoNum;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class AddTwoNum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            sum = sum % 10;
            current.next = new ListNode(sum);
            current = current.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListNode l1 = createLinkedListFromInput(scanner);

        ListNode l2 = createLinkedListFromInput(scanner);

        AddTwoNum AddTwoNum = new AddTwoNum();
        ListNode result = AddTwoNum.addTwoNumbers(l1, l2);

        printLinkedList(result);
    }

    private static ListNode createLinkedListFromInput(Scanner scanner) {
        String[] values = scanner.nextLine().split(" ");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String value : values) {
            int num = Integer.parseInt(value);
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    private static void printLinkedList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" ");
            }
            node = node.next;
        }
        System.out.println();
    }
}
