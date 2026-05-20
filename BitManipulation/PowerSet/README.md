## Power Set | Bit Manipulation

### Problem Statement
Given an array of numbers, print all possible subsets (power set) using bit manipulation.

---

### Examples

Example 1

Input:  
nums = [1, 2, 3]

Output:  
[[], [1], [2], [3], [1,2], [2,3], [1,3], [1,2,3]]

Explanation:  
A power set contains all possible subsets of the array, including the empty subset.

---

Example 2

Input:  
nums = [5, 7, 8]

Output:  
[[], [5], [7], [8], [5,7], [7,8], [5,8], [5,7,8]]

Explanation:  
All possible combinations of elements are included in the power set.

---

### Approach

Use bitmasking to represent subsets.

For an array of size N:
- Total subsets = 2^N
- Each number from 0 to (2^N - 1) represents one subset.

---

### Algorithm

1. Let n be the size of the array.  
2. Total subsets = 1 << n.  
3. Iterate from mask = 0 to (2^n - 1):
   - Create an empty subset.  
4. For each bit position i:
   - Check if the i-th bit in mask is set:
     - (mask & (1 << i)) != 0  
   - If set, include nums[i] in the subset.  
5. Add the subset to the result list.  
6. Return all subsets.

---

### Author
- Rohit
