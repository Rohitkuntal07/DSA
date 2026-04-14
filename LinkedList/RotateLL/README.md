## Rotate a Linked List

### Problem Statement
Given the head of a singly linked list, rotate the list to the right by k places and return the new head.  
Only change the links between nodes, do not modify node values.

---

### Examples

Example 1

Input:  
head -> 1 -> 2 -> 3 -> 4 -> 5, k = 2

Output:  
4 -> 5 -> 1 -> 2 -> 3

Explanation:  
After 1 rotation: 5 -> 1 -> 2 -> 3 -> 4  
After 2 rotations: 4 -> 5 -> 1 -> 2 -> 3

---

Example 2

Input:  
head -> 1 -> 2 -> 3 -> 4 -> 5, k = 4

Output:  
2 -> 3 -> 4 -> 5 -> 1

Explanation:  
After 4 rotations, the list becomes 2 -> 3 -> 4 -> 5 -> 1

---

### Approach

Convert the list into a circular linked list and break it at the correct position.

---

### Algorithm

1. If the list is empty, has one node, or k = 0, return head.  
2. Traverse the list to find its length.  
3. Connect the last node to the head to form a circular list.  
4. Compute effective rotations as k % length.  
5. Find the new tail at position (length - k % length - 1).  
6. Set new head as newTail.next.  
7. Break the circular link by setting newTail.next = null.  
8. Return the new head.

---

### Author
- Rohit
