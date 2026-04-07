## Detect a Cycle in a Linked List

### Problem Statement
Given the head of a linked list, determine whether the linked list contains a cycle or not.

---

### Examples

Example 1

Input:  
LL: 1 2 3 4 5

Output:  
True

Explanation:  
The last node points back to a previous node, forming a loop in the list.

---

Example 2

Input:  
LL: 1 2 3 4 9 9

Output:  
False

Explanation:  
The linked list does not contain any cycle.

---

### Approach

Use the Tortoise and Hare (Floyd’s Cycle Detection) algorithm.

---

### Algorithm

1. Initialize two pointers slow and fast at the head.  
2. Move slow one step and fast two steps at a time.  
3. If fast or fast.next becomes null, return false (no cycle).  
4. If slow and fast meet at any point, return true (cycle exists).

---

### Author
- Rohit
