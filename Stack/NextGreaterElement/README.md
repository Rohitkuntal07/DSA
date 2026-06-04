## Next Greater Element Using Stack

### Problem Statement
Given an integer array arr, find the Next Greater Element (NGE) for every element.

The Next Greater Element of an element is the first element greater than it that appears on its right side. If no such element exists, return -1 for that position.

---

### Examples

Example 1

Input:  
arr = [1, 3, 2, 4]

Output:  
[3, 4, 4, -1]

Explanation:

- Next greater of 1 is 3
- Next greater of 3 is 4
- Next greater of 2 is 4
- 4 has no greater element on its right

---

Example 2

Input:  
arr = [6, 8, 0, 1, 3]

Output:  
[8, -1, 1, 3, -1]

Explanation:

- Next greater of 6 is 8
- 8 has no greater element
- Next greater of 0 is 1
- Next greater of 1 is 3
- 3 has no greater element

---

### Approach

Use a Monotonic Decreasing Stack.

The stack stores potential next greater elements. While traversing from right to left, remove all elements smaller than or equal to the current element because they can never serve as the next greater element.

---

### Algorithm

1. Create:
   - A result array of size N.
   - An empty stack.

2. Traverse the array from right to left.

3. For each element arr[i]:
   - Pop elements from the stack while:
     - stack.peek() <= arr[i]

4. After removing smaller elements:
   - If the stack is empty:
     - result[i] = -1
   - Otherwise:
     - result[i] = stack.peek()

5. Push arr[i] into the stack.

6. Continue until all elements are processed.

7. Return the result array.

---

### Time Complexity

- O(N)

Each element is pushed and popped at most once.

### Space Complexity

- O(N)

---

### Author
- Rohit
