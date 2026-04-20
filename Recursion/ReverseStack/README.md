## Reverse a Stack Using Recursion

### Problem Statement
Given a stack of integers, reverse the stack using recursion.  
Only standard stack operations (push, pop, top/peek, isEmpty) are allowed.  
Do not use loops or additional data structures.

---

### Examples

Example 1

Input:  
stack = [4, 1, 3, 2]

Output:  
[2, 3, 1, 4]

---

Example 2

Input:  
stack = [10, 20, -5, 7, 15]

Output:  
[15, 7, -5, 20, 10]

---

### Approach

Use recursion along with a helper function to insert elements at the bottom of the stack.

---

### Algorithm

1. Define a helper function insertAtBottom(stack, x):
   - If stack is empty, push x and return.  
   - Otherwise, pop the top element, call insertAtBottom recursively, then push the popped element back.  

2. Define reverseStack(stack):
   - If stack is empty, return.  
   - Pop the top element.  
   - Recursively reverse the remaining stack.  
   - Insert the popped element at the bottom using insertAtBottom.  

3. The stack will be reversed in-place.

---

### Author
- Rohit
