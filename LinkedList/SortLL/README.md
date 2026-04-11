## Sort a Linked List

### Problem Statement
Given a linked list, sort its nodes based on their data values and return the head of the sorted list.

---

### Examples

Example 1

Input:  
3->4->2->1->5

Output:  
1->2->3->4->5

Explanation:  
The linked list is sorted in ascending order.

---

Example 2

Input:  
40->20->60->10->50->30

Output:  
10->20->30->40->50->60

Explanation:  
The linked list is sorted in ascending order.

---

### Approach

Use Merge Sort to efficiently sort the linked list.

---

### Algorithm

1. If the list is empty or has only one node, return it as it is already sorted.  
2. Use slow and fast pointers to find the middle of the list.  
3. Split the list into two halves.  
4. Recursively sort both halves.  
5. Merge the two sorted halves using a helper function.  
6. Return the head of the merged sorted list.

---

### Author
- Rohit
