## Implement Min Stack

### Problem Statement
Design a stack that supports the following operations in constant time:

- push(int val)
- pop()
- top()
- getMin()

The stack should always be able to return the minimum element in O(1) time.

---

### Examples

Example 1

Input:  
["MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"]  
[[], [-2], [0], [-3], [], [], [], []]

Output:  
[null, null, null, null, -3, null, 0, -2]

Explanation:

- push(-2)
- push(0)
- push(-3)
- getMin() → -3
- pop()
- top() → 0
- getMin() → -2

---

Example 2

Input:  
["MinStack", "push", "push", "getMin", "push", "pop", "getMin", "top"]  
[[], [5], [1], [], [3], [], [], []]

Output:  
[null, null, null, 1, null, null, 1, 1]

Explanation:

- push(5)
- push(1)
- getMin() → 1
- push(3)
- pop()
- getMin() → 1
- top() → 1

---

## Brute Force Approach (O(2N) Space)

### Approach

Use two stacks:

- Main Stack → Stores all elements.
- Min Stack → Stores the minimum element corresponding to each position.

---

### Algorithm

#### Push Operation

1. Push the element into the main stack.
2. If the min stack is empty:
   - Push the element into min stack.
3. Otherwise:
   - Push min(currentElement, minStack.peek()).

---

#### Pop Operation

1. Pop from the main stack.
2. Pop from the min stack.

---

#### Top Operation

1. Return mainStack.peek().

---

#### GetMin Operation

1. Return minStack.peek().

---

### Time Complexity

- Push → O(1)
- Pop → O(1)
- Top → O(1)
- GetMin → O(1)

### Space Complexity

- O(2N)

---

## Optimal Approach (O(N) Space)

### Approach

Use a single stack and a variable minElement.

Store encoded values whenever a new minimum is inserted.

Encoding Formula:

encodedValue = 2 * newMin - oldMin

---

### Algorithm

#### Push Operation

1. If stack is empty:
   - Push value.
   - Set minElement = value.

2. If value >= minElement:
   - Push value normally.

3. If value < minElement:
   - Push:
     - 2 * value - minElement
   - Update:
     - minElement = value

---

#### Pop Operation

1. If stack is empty:
   - Return.

2. Pop top element.

3. If popped value >= minElement:
   - Normal element.

4. If popped value < minElement:
   - Previous minimum exists.
   - Restore:
     - minElement = 2 * minElement - poppedValue

---

#### Top Operation

1. If stack is empty:
   - Return -1.

2. If top >= minElement:
   - Return top.

3. Otherwise:
   - Return minElement.

---

#### GetMin Operation

1. Return minElement.

---

### Time Complexity

- Push → O(1)
- Pop → O(1)
- Top → O(1)
- GetMin → O(1)

### Space Complexity

- O(N)

### Author
- Rohit
