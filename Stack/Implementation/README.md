## Implement Stack using Array

### Problem Statement
Implement a Last-In-First-Out (LIFO) stack using an array.

The stack should support the following operations:

- push(int x) → Push an element onto the stack.  
- pop() → Remove and return the top element.  
- top() → Return the top element without removing it.  
- isEmpty() → Check whether the stack is empty.  

---

### Examples

Example 1

Input:  
["ArrayStack", "push", "push", "top", "pop", "isEmpty"]  
[[], [5], [10], [], [], []]

Output:  
[null, null, null, 10, 10, false]

Explanation:  

- stack.push(5)  
- stack.push(10)  
- stack.top() → 10  
- stack.pop() → 10  
- stack.isEmpty() → false  

---

Example 2

Input:  
["ArrayStack", "isEmpty", "push", "pop", "isEmpty"]  
[[], [], [1], [], []]

Output:  
[null, true, null, 1, true]

Explanation:  

- stack.push(1)  
- stack.pop() → 1  
- stack.isEmpty() → true  

---

### Approach

Use an array with a variable top to keep track of the current top element.

---

### Algorithm

1. Create an array of fixed size to store stack elements.  

2. Initialize:
   - top = -1  
   - This indicates the stack is empty.  

---

### Push Operation

1. Check if the stack is full:
   - top == size - 1  

2. If full:
   - Throw stack overflow exception.  

3. Otherwise:
   - Increment top  
   - Insert element at arr[top]  

---

### Pop Operation

1. Check if stack is empty:
   - top == -1  

2. If empty:
   - Throw stack underflow exception.  

3. Otherwise:
   - Store arr[top]  
   - Decrement top  
   - Return stored element  

---

### Top Operation

1. Check if stack is empty.  

2. If not empty:
   - Return arr[top]  

---

### isEmpty Operation

1. If top == -1:
   - Return true  

2. Otherwise:
   - Return false  

---

### Size Operation

1. Current size of stack:
   - top + 1

---
### Author
- Rohit
