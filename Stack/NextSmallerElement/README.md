## Next Smaller Element

### Problem Statement
Given an array of integers arr, find the Next Smaller Element (NSE) for every element.

The Next Smaller Element of an element x is the first element to the right of x that is smaller than x.

If no smaller element exists on the right side, return -1 for that position.

---

### Examples

Example 1

Input:  
arr = [4, 8, 5, 2, 25]

Output:  
[2, 5, 2, -1, -1]

Explanation:

- NSE of 4 is 2
- NSE of 8 is 5
- NSE of 5 is 2
- NSE of 2 is -1
- NSE of 25 is -1

---

Example 2

Input:  
arr = [10, 9, 8, 7]

Output:  
[9, 8, 7, -1]

Explanation:

- NSE of 10 is 9
- NSE of 9 is 8
- NSE of 8 is 7
- NSE of 7 is -1

---

### Approach

Use a Monotonic Increasing Stack.

While traversing from right to left, remove all elements greater than or equal to the current element because they cannot be the next smaller element.

The top of the stack (if present) will always be the nearest smaller element on the right.

---

### Algorithm

1. Create:
   - An answer array of size N initialized with -1.
   - An empty stack.

2. Traverse the array from right to left.

3. For each element arr[i]:
   - While the stack is not empty and:
     - stack.peek() >= arr[i]
   - Pop elements from the stack.

4. After removing invalid elements:
   - If the stack is not empty:
     - answer[i] = stack.peek()
   - Otherwise:
     - answer[i] = -1

5. Push arr[i] into the stack.

6. Continue until all elements are processed.

7. Return the answer array.

---

### Dry Run

Input:

arr = [4, 8, 5, 2, 25]

Processing from right to left:

- 25 → NSE = -1
- 2 → NSE = -1
- 5 → NSE = 2
- 8 → NSE = 5
- 4 → NSE = 2

Result:

[2, 5, 2, -1, -1]

---

### Time Complexity

- O(N)

Each element is pushed and popped at most once.

### Space Complexity

- O(N)

---

### Author
- Rohit
