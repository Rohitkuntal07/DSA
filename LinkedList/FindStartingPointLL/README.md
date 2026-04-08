## Starting Point of Loop in a Linked List

### Problem Statement
Given the head of a linked list that may contain a cycle, return the starting point of that cycle.  
If there is no cycle, return null.

---

### Examples

Example 1

Input:  
LL: 1 2 3 4 5

Output:  
3

Explanation:  
The linked list contains a loop starting at node with value 3.

---

Example 2

Input:  
LL: 1 -> 2 -> 3 -> 4 -> 9 -> 9

Output:  
null

Explanation:  
The linked list does not contain any cycle.

---

### Approach

Use the Tortoise and Hare (Floyd’s Cycle Detection) algorithm.

---

### Algorithm

1. Initialize two pointers slow and fast at the head.  
2. Move slow one step and fast two steps at a time.  
3. If fast or fast.next becomes null, return null (no cycle).  
4. If slow and fast meet, a cycle exists.  
5. Reset slow to the head.  
6. Move both slow and fast one step at a time.  
7. The point where they meet again is the starting node of the cycle.  
8. Return that node.

---

### Author
- Rohit
