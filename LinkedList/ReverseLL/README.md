## Reverse a Linked List

### Problem Statement
Given the head of a singly linked list, reverse the linked list and return the new head.

---

### Approach

Reverse the list by changing the direction of the next pointers.

---

### Algorithm

1. Initialize a pointer current to the head of the list.  
2. Initialize a pointer prev as null.  
3. Traverse the list until current becomes null.  
4. For each node:
   - Store the next node in a temporary variable.  
   - Reverse the next pointer of the current node to point to prev.  
   - Move prev to the current node.  
   - Move current to the next node.  
5. After traversal, prev will be the new head of the reversed list.  
6. Return prev.

---

### Author
- Rohit
