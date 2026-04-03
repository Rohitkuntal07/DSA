## Delete Last Node of a Doubly Linked List

### Problem Statement
Given a doubly linked list, delete the last node of the list and return the updated list.

---

### Examples

Example 1

Input:  
DLL: 1 <-> 3 <-> 4 <-> 1

Output:  
1 <-> 3 <-> 4

Explanation:  
The last node (1) is removed from the list.

---

Example 2

Input:  
DLL: 7 <-> 5

Output:  
7

Explanation:  
The last node (5) is removed from the list.

---

### Approach

Update the connection between the last node and the second last node.

---

### Algorithm

1. If the list is empty, return immediately.  
2. If the list has only one node, delete it and return an empty list.  
3. Traverse the list to reach the last node (tail).  
4. Access the second last node using the prev pointer of the tail.  
5. Set the next pointer of the second last node to null.  
6. Set the prev pointer of the last node to null.  
7. Return the head of the updated list.

---

### Author
- Rohit
