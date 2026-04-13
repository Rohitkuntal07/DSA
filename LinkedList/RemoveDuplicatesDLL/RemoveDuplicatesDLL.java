import java.util.*;

// Node class representing a node in a doubly linked list
class Node {
    int data;       
    Node prev;      
    Node next;      

    // Constructor to initialize node with given value
    Node(int value) {
        data = value;
        prev = null;
        next = null;
    }
}

// Solution class containing methods to manipulate the doubly linked list
class Solution {
    Node head = null;

    // Function to insert a node at the end of the list
    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        // If list is empty, set new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the new node at the end
        current.next = newNode;
        newNode.prev = current;
    }

    // Function to remove duplicate values from a sorted doubly linked list
    public Node removeDuplicates() {
        // If the list is empty, return null
        if (head == null) return null;

        Node current = head;

        // Traverse the list until the second last node
        while (current != null && current.next != null) {
            Node nextDistinct = current.next;

            // Skip and unlink all nodes with the same value as current
            while (nextDistinct != null && nextDistinct.data == current.data) {
                nextDistinct = nextDistinct.next;
            }

            // Connect current node to the next distinct node
            current.next = nextDistinct;
            if (nextDistinct != null) {
                nextDistinct.prev = current;
            }

            // Move to the next node
            current = current.next;
        }

        return head;
    }

    // Function to print the list
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Initial list values (with duplicates)
        int[] values = {1, 2, 2, 2, 3, 4, 4, 5, 5, 6};

        for (int value : values) {
            sol.insertAtEnd(value);
        }

        // Print the original list
        System.out.print("Original List: ");
        sol.printList();

        // Remove duplicate nodes
        sol.removeDuplicates();

        // Print the updated list
        System.out.print("After Removing Duplicates (keeping 1 occurrence): ");
        sol.printList();
    }
}
