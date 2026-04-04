## Reverse a Doubly Linked List

### Problem Statement
Given a doubly linked list of size N, reverse it and return the head of the modified list.

---

### Examples

Example 1

Input:  
DLL: 1 <-> 2 <-> 3 <-> 4

Output:  
4 <-> 3 <-> 2 <-> 1

Explanation:  
The doubly linked list is reversed and the last node becomes the new head.

---

Example 2

Input:  
DLL: 10 <-> 20 <-> 30

Output:  
30 <-> 20 <-> 10

Explanation:  
The doubly linked list is reversed and the original tail becomes the new head.

---

### Approach

Reverse the list by swapping the next and prev pointers of each node.

---

### Algorithm

1. Initialize a pointer current to the head of the list.  
2. Initialize a pointer last as null.  
3. Traverse the list while current is not null.  
4. For each node:
   - Swap its next and prev pointers.  
   - Move current to its previous node (which is originally the next node).  
5. Keep track of the last processed node.  
6. After traversal, update the head to the last node.  
7. Return the new head of the reversed list.

---

### Author
- Rohit
