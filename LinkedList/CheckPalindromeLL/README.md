## Check if Linked List is Palindrome

### Problem Statement
Given the head of a singly linked list representing a number, check whether the linked list is a palindrome or not.  
Return true if it is a palindrome, otherwise return false.

A palindrome is a sequence that reads the same forward and backward.

---

### Examples

Example 1

Input:  
head -> 3 -> 7 -> 5 -> 7 -> 3

Output:  
true

Explanation:  
37573 is a palindrome.

---

Example 2

Input:  
head -> 1 -> 1 -> 2 -> 1

Output:  
false

Explanation:  
1121 is not a palindrome.

---

### Approach

Find the middle of the list, reverse the second half, and compare both halves.

---

### Algorithm

1. If the list is empty or has one node, return true.  
2. Use slow and fast pointers to find the middle of the list.  
3. Reverse the second half of the list starting from slow.next.  
4. Compare the first half and the reversed second half node by node.  
5. If any mismatch occurs, return false.  
6. Reverse the second half again to restore the original list.  
7. Return true if all nodes match.

---

### Author
- Rohit
