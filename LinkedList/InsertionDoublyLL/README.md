## Insert at End of Doubly Linked List

### Problem Statement
Given a doubly linked list and a value k, insert a node with value k at the end of the list.

---

### Examples

Example 1

Input:  
DLL: 1 <-> 2 <-> 3 <-> 4  
Value to be inserted: 6  

Output:  
1 <-> 2 <-> 3 <-> 4 <-> 6  

Explanation:  
A new node with value 6 is inserted at the end of the list.

---

Example 2

Input:  
DLL: 10 <-> 20 <-> 30  
Value to be inserted: 40  

Output:  
10 <-> 20 <-> 30 <-> 40  

Explanation:  
A new node with value 40 is inserted at the end of the list.

---

### Approach

Traverse the list to reach the last node and insert the new node after it.

---

### Algorithm

1. If the list is empty, create a new node and return it as head.  
2. Traverse the list to reach the last node (tail).  
3. Create a new node with value k.  
4. Set the next pointer of the tail to the new node.  
5. Set the prev pointer of the new node to the tail.  
6. Set the next pointer of the new node to null.  
7. Return the head of the updated list.

--- 

 ### Author
 - Rohit
