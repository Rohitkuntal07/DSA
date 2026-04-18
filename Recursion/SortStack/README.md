## Sort a Stack

### Problem Statement
Given a stack of integers, sort the stack in descending order using recursion such that the top of the stack contains the greatest element.  
Only standard stack operations (push, pop, top, isEmpty) and recursion are allowed.

---

### Examples

Example 1

Input:  
stack = [4, 1, 3, 2]

Output:  
[4, 3, 2, 1]

Explanation:  
After sorting, the largest element (4) is at the top and the smallest (1) is at the bottom.

---

Example 2

Input:  
stack = [1]

Output:  
[1]

Explanation:  
A single-element stack is already sorted.

---

### Approach

Use recursion to sort the stack and a helper function to insert elements at the correct position.

---

### Algorithm

1. If the stack is empty, return.  
2. Remove the top element from the stack.  
3. Recursively sort the remaining stack.  
4. Insert the removed element back into the sorted stack using a helper function:
   - If the stack is empty or the top is smaller than the element, push it.  
   - Otherwise, remove the top, recursively insert the element, then push the removed element back.  
5. The stack will be sorted in descending order.

---

### Author
- Rohit
