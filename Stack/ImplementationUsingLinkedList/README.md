## Implement Stack using Linked List

### Problem Statement
Implement a Last-In-First-Out (LIFO) stack using a singly linked list.

The stack should support the following operations:

- push(int x) → Push an element onto the stack.
- pop() → Remove and return the top element.
- top() → Return the top element without removing it.
- isEmpty() → Check whether the stack is empty.

---

### Examples

Example 1

Input:  
["LinkedListStack", "push", "push", "pop", "top", "isEmpty"]  
[[], [3], [7], [], [], []]

Output:  
[null, null, null, 7, 3, false]

Explanation:

- stack.push(3)
- stack.push(7)
- stack.pop() → 7
- stack.top() → 3
- stack.isEmpty() → false

---

Example 2

Input:  
["LinkedListStack", "isEmpty"]  
[[]]

Output:  
[null, true]

Explanation:

- stack.isEmpty() → true

---

### Approach

Use a singly linked list where the head node always represents the top of the stack.

This allows push and pop operations to be performed in O(1) time.

---

### Algorithm

#### Node Structure

1. Create a Node class containing:
   - data
   - next pointer

2. Initialize both values using a constructor.

---

#### Stack Structure

1. Maintain:
   - top pointer (head node)
   - size variable

2. Initially:
   - top = null
   - size = 0

---

#### Push Operation

1. Create a new node with the given value.
2. Set:
   - newNode.next = top
3. Update:
   - top = newNode
4. Increment size.

---

#### Pop Operation

1. If stack is empty:
   - Return -1 (or throw exception).

2. Store:
   - top.data

3. Move top to:
   - top.next

4. Decrement size.

5. Return stored value.

---

#### Top Operation

1. If stack is empty:
   - Return -1 (or throw exception).

2. Return:
   - top.data

---

#### isEmpty Operation

1. Check:
   - top == null

2. Return:
   - true if empty
   - false otherwise

---

#### Size Operation

1. Return the current value of size.

---

#### Print Stack

1. Start from top.
2. Traverse using next pointers.
3. Print each node until null is reached.

---

### Time Complexity

- Push → O(1)
- Pop → O(1)
- Top → O(1)
- isEmpty → O(1)

### Space Complexity

- O(N)

---

### Author
- Rohit
