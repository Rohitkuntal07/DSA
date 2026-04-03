// Node structure for DLL
class Node {
    int data;
    Node prev, next;
    Node(int val) {
        data = val;
        prev = null;
        next = null;
    }
}

class Solution {
    // Function to delete tail of DLL
    public Node deleteTail(Node head) {
        // If list is empty
        if (head == null) return null;

        // If only one node present
        if (head.next == null) return null;

        // Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Update second last node's next to null
        temp.prev.next = null;

        // Return head
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a sample DLL: 1 <-> 2 <-> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        Solution obj = new Solution();
        head = obj.deleteTail(head);

        // Print list after deletion
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
