## Implement Stack using Single Queue

### Problem Statement
Implement a Last-In-First-Out (LIFO) stack using only a single queue.

The stack should support the following operations:

- push(int x) → Push an element onto the stack.  
- pop() → Remove and return the top element.  
- top() → Return the top element without removing it.  
- isEmpty() → Check whether the stack is empty.  

---

### Examples

Example 1

Input:  
["QueueStack", "push", "push", "pop", "top", "isEmpty"]  
[[], [4], [8], [], [], []]

Output:  
[null, null, null, 8, 4, false]

Explanation:

- stack.push(4)
- stack.push(8)
- stack.pop() → 8
- stack.top() → 4
- stack.isEmpty() → false

---

Example 2

Input:  
["QueueStack", "isEmpty"]  
[[]]

Output:  
[null, true]

Explanation:

- stack.isEmpty() → true

---

### Approach

Use a single queue and rotate its elements after every push operation so that the most recently inserted element always stays at the front.

---

### Algorithm

#### Push Operation

1. Insert the new element into the queue.
2. Let size be the current queue size.
3. Rotate the first (size - 1) elements:
   - Remove the front element.
   - Insert it at the rear.
4. After rotation, the newly added element becomes the front of the queue.

---

#### Pop Operation

1. Remove and return the front element of the queue.
2. This corresponds to the top element of the stack.

---

#### Top Operation

1. Return the front element of the queue.
2. Do not remove it.

---

#### isEmpty Operation

1. Check whether the queue is empty.
2. Return:
   - true if empty.
   - false otherwise.

---

### Time Complexity

- Push → O(N)
- Pop → O(1)
- Top → O(1)
- isEmpty → O(1)

### Space Complexity

- O(N)

---

### Author
- Rohit
