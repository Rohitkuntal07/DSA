## Find Middle Element in a Linked List

### Problem Statement
Given the head of a linked list, determine the middle node of the list.  
If the list has an even number of nodes, return the second middle node.

---

### Examples

Example 1

Input:  
LL: 1 2 3 4 5

Output:  
3

Explanation:  
Node with value 3 is the middle node.

---

Example 2

Input:  
LL: 1 2 3 4 5 6

Output:  
4

Explanation:  
The list has an even number of nodes, so the second middle node (4) is returned.

---

### Approach

Use the Tortoise and Hare (slow and fast pointers) technique.

---

### Algorithm

1. Initialize two pointers slow and fast at the head.  
2. Move slow one step and fast two steps at a time.  
3. Continue until fast is null or fast.next is null.  
4. At this point, slow will be at the middle node.  
5. Return slow.

---

### Author
- Rohit
