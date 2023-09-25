package MergeSortedList;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeSortedList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode node = head;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }

        if (l1 != null)
            node.next = l1;
        if (l2 != null)
            node.next = l2;
        
        return head.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values for the first sorted list (e.g., 1 2 4):");
        ListNode l1 = createLinkedListFromInput(scanner);

        System.out.println("Enter the values for the second sorted list (e.g., 1 3 4):");
        ListNode l2 = createLinkedListFromInput(scanner);

        MergeSortedList MergeSortedList = new MergeSortedList();
        ListNode mergedList = MergeSortedList.mergeTwoLists(l1, l2);

        System.out.println("Merged List:");
        printLinkedList(mergedList);
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
