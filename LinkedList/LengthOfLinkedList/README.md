## Find the Length of a Linked List

### Problem Statement
Given the head of a linked list, return the length of the linked list.

---

### Examples

Example 1

Input:  
0->1->2

Output:  
3

Explanation:  
The list has a total of 3 nodes, so the length is 3.

---

Example 2

Input:  
12->5->8->7

Output:  
4

Explanation:  
The list has a total of 4 nodes, so the length is 4.

---

### Approach

Traverse the linked list and count the number of nodes.

---

### Algorithm

1. Initialize a counter to 0.  
2. Set a temporary pointer to the head of the list.  
3. Traverse the list until the current node becomes null.  
4. Increment the counter at each node.  
5. Return the counter as the length of the linked list.

--- 

### Author
- Rohit
