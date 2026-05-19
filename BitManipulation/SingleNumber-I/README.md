## Find the Number that Appears Once

### Problem Statement
Given a non-empty array of integers where every element appears twice except for one, find the element that appears only once.

---

### Examples

Example 1

Input:  
arr = {2, 2, 1}

Output:  
1

Explanation:  
Only the element 1 appears once.

---

Example 2

Input:  
arr = {4, 1, 2, 1, 2}

Output:  
4

Explanation:  
All elements appear twice except 4.

---

### Approach

Use the XOR operator to cancel out duplicate numbers.

---

### XOR Properties

1. a ^ a = 0  
   - XOR of two same numbers is 0.

2. a ^ 0 = a  
   - XOR of any number with 0 gives the number itself.

---

### Algorithm

1. Initialize result = 0.  
2. Traverse the array:
   - result = result ^ arr[i]  
3. Duplicate numbers cancel each other out.  
4. The remaining value is the number that appears once.  
5. Return result.

---

### Author
- Rohit
