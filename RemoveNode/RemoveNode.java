package RemoveNode;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNode {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode current = head;
        
        while (current != null) {
            if (current.val == val) {
               
                prev.next = current.next;
            } else {
                
                prev = current;
            }
            current = current.next;
        }
        
        return dummy.next; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the values of the linked list (space-separated): ");
        String[] values = scanner.nextLine().split(" ");

        
        ListNode head = null;
        ListNode tail = null;
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

       
        System.out.print("Enter the value to remove: ");
        int val = scanner.nextInt();
        
        scanner.close();
        
        // Call the removeElements function to remove nodes with the specified value
        ListNode newHead = removeElements(head, val);

        // Print the updated linked list
        while (newHead != null) {
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.println("null");
    }
}

