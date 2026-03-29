// Definition for singly linked list
class Node {
    int data;
    Node next;
    Node(int val) {
        data = val;
        next = null;
    }
}

class Solution {
    // Function to delete tail node of linked list
    public Node deleteTail(Node head) {
        // If list is empty or has one node
        if (head == null || head.next == null) {
            return null;
        }

        // Traverse to the second last node
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        // Delete tail node
        curr.next = null;

        // Return updated head
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Solution obj = new Solution();
        head = obj.deleteTail(head);

        // Print list after deletion
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
