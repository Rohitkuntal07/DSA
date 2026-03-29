## Delete Last Node of Linked List

### Problem Statement
Given a linked list, delete the tail of the list and return the updated linked list.

---

### Examples

Example 1

Input:  
0->1->2

Output:  
0->1

Explanation:  
The last node of the linked list is 2.

---

Example 2

Input:  
12->5->8->7

Output:  
12->5->8

Explanation:  
The last node of the linked list is 7.

---

### Approach

To delete the tail of a linked list, update the connection between the last node and the second last node.

---

### Algorithm

1. If the list is empty, return immediately.  
2. If the list has only one node, delete it and return an empty list.  
3. Traverse the linked list to reach the second last node.  
4. Set the next pointer of the second last node to null.  
5. Delete the last node.  
6. Return the head of the updated linked list.

---

### Author
- Rohit
