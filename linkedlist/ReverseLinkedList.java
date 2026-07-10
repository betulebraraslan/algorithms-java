/*
 * Problem:
 * Given the head of a singly linked list,
 * reverse the list and return the new head.
 *
 * A singly linked list consists of nodes where each node
 * contains a value and a reference to the next node.
 *
 * Return the head of the reversed linked list.
 *
 * Example:
 *
 * Input:
 * 1 -> 2 -> 3 -> 4 -> 5
 *
 * Output:
 * 5 -> 4 -> 3 -> 2 -> 1
 *
 * Input:
 * 1 -> 2
 *
 * Output:
 * 2 -> 1
 *
 * Input:
 * []
 *
 * Output:
 * []
 *
 * Data Structure:
 * - Singly Linked List
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 */


public class ReverseLinkedList{
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = reverseLinkedList(head);
        printList(head);
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
    }
}