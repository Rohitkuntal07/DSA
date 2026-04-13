## Remove Duplicates from Sorted Doubly Linked List

### Problem Statement
Given the head of a doubly linked list sorted in non-decreasing order, remove all duplicate occurrences so that only distinct values remain.

---

### Examples

Example 1

Input:  
head -> 1 <-> 1 <-> 3 <-> 3 <-> 4 <-> 5

Output:  
1 <-> 3 <-> 4 <-> 5

Explanation:  
Duplicate occurrences of 1 and 3 are removed.

---

Example 2

Input:  
head -> 1 <-> 1 <-> 1 <-> 1 <-> 1 <-> 2

Output:  
1 <-> 2

Explanation:  
All duplicate occurrences of 1 are removed.

---

### Approach

Since the list is sorted, duplicates will be adjacent. Traverse the list and remove duplicate nodes.

---

### Algorithm

1. Start from the head of the list.  
2. Traverse the list while current and current.next are not null.  
3. If current.data equals current.next.data:
   - Remove the next node by updating pointers.  
   - Set current.next to current.next.next.  
   - If current.next is not null, update its prev pointer.  
4. If values are different, move to the next node.  
5. Continue until the end of the list.  
6. Return the head of the modified list.

---

### Author
- Rohit
