package ReverseLinkedList;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        
        return prev; 
    }

    public static void main(String[] args) {
        
        ListNode head = null;
        ListNode tail = null;

        System.out.print("Enter the values of the linked list (space-separated, e.g., 1 2 3): ");
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        
        for (String value : values) {
            int num = Integer.parseInt(value);
            if (head == null) {
                head = new ListNode(num);
                tail = head;
            } else {
                tail.next = new ListNode(num);
                tail = tail.next;
            }
        }
        
        scanner.close();
        
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversedHead = solution.reverseList(head);
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " -> ");
            reversedHead = reversedHead.next;
        }
        System.out.println("null");
    }
}

