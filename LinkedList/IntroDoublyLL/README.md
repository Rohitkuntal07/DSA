## Doubly Linked List

### Introduction
A Doubly Linked List allows traversal in both directions by maintaining two pointers in each node.  
Each node contains a pointer to the next node and a pointer to the previous node.

This enables seamless forward and backward traversal, making it useful for advanced data structure applications.

---

### Structure of a Node

Each node in a doubly linked list contains:

1. Data → stores the value  
2. Next → pointer to the next node  
3. Prev → pointer to the previous node  

---
### Key Points

- The "prev" pointer allows backward traversal.  
- Unlike singly linked lists, nodes are connected in both directions.  
- Constructors initialize both next and prev pointers.  
- Useful in applications like navigation systems, undo-redo operations, and caching.

--- 


### Code (Java)

```java
import java.util.*;

// Class representing a node in Doubly Linked List
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data1, Node next1, Node prev1) {
        data = data1;
        next = next1;
        prev = prev1;
    }

    Node(int data1) {
        data = data1;
        next = null;
        prev = null;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};

        Node head = new Node(arr[0]);

        System.out.println(head);
        System.out.println(head.data);
    }
}
