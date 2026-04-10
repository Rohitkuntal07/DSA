## Remove N-th Node from End of Linked List

### Problem Statement
Given a linked list and an integer N, delete the N-th node from the end of the list and return the updated list.

---

### Examples

Example 1

Input:  
5->1->2, N = 2

Output:  
5->2

Explanation:  
The 2nd node from the end is 1, so it is removed.

---

Example 2

Input:  
1->2->3->4->5, N = 3

Output:  
1->2->4->5

Explanation:  
The 3rd node from the end is 3, so it is removed.

---

### Approach

Use two pointers (slow and fast) to find the node in one traversal.

---

### Algorithm

1. Initialize two pointers slow and fast at the head.  
2. Move fast pointer N steps ahead.  
3. If fast becomes null, delete the head node and return the new head.  
4. Move both slow and fast one step at a time until fast.next becomes null.  
5. Now slow is just before the node to be deleted.  
6. Update slow.next to skip the target node.  
7. Return the head of the updated list.

---

### Author
- Rohit
