## Next Greater Element - II

### Problem Statement
Given a circular integer array arr, return the Next Greater Element (NGE) for every element.

The Next Greater Element of an element is the first greater element encountered while traversing the array in a clockwise direction. If no greater element exists, return -1.

---

### Examples

Example 1

Input:  
arr = [3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9]

Output:  
[10, -1, 6, 6, 2, 6, 7, 7, 9, 9, 10]

Explanation:

- NGE of 3 is 10
- NGE of 10 is -1
- NGE of 4 is 6
- NGE of 2 is 6
- and so on...

---

Example 2

Input:  
arr = [5, 7, 1, 7, 6, 0]

Output:  
[7, -1, 7, -1, 7, 5]

Explanation:

- NGE of 5 is 7
- NGE of 7 is -1
- NGE of 1 is 7
- NGE of 6 is 7
- NGE of 0 is 5

---

### Approach

Use a Monotonic Decreasing Stack and traverse the array twice to simulate circular behavior.

Since the array is circular, elements at the beginning can be the next greater element for elements near the end.

---

### Algorithm

1. Create:
   - An answer array of size N initialized with -1.
   - An empty stack.

2. Traverse from:
   - i = 2*N - 1 down to 0

3. Access the current element using:
   - arr[i % N]

4. While the stack is not empty and:
   - stack.peek() <= arr[i % N]
   - Pop elements from the stack.

5. If i < N:
   - The current index belongs to the original array.
   - If stack is not empty:
     - answer[i] = stack.peek()
   - Otherwise:
     - answer[i] = -1

6. Push arr[i % N] into the stack.

7. Continue until traversal completes.

8. Return the answer array.

---

### Why Traverse Twice?

For a circular array:

Example:

arr = [1, 2, 1]

For the last element (1), the next greater element is 2, which appears before it in the array.

Traversing 2*N times simulates one complete circular rotation.

---

### Time Complexity

- O(N)

Each element is pushed and popped at most once.

### Space Complexity

- O(N)

---

### Author
- Rohit
