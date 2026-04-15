## Flattening a Linked List

### Problem Statement
Given a linked list where each node contains two pointers:  
Next → points to the next node  
Child → points to another linked list  

Each child linked list is sorted. Flatten the list such that all nodes appear in a single level in sorted order.

---

### Examples

Example 1

Input:  
Linked list with next and child pointers

Output:  
1 2 3 4 5 6 7 8 9 10 11 12

Explanation:  
All nodes from different child lists are merged into a single sorted list.

---

Example 2

Input:  
Linked list with multiple sorted child lists

Output:  
1 2 3 4 5 6 7 8 9 10 11 12

Explanation:  
The final flattened list is sorted and contains all nodes.

---

### Approach

Use recursion and merge two sorted linked lists.

---

### Algorithm

1. If head is null or head.next is null, return head.  
2. Recursively flatten the list starting from head.next.  
3. Merge the current list with the flattened next list using a merge function.  
4. Return the merged list as the new head.

---

### Author
- Rohit
