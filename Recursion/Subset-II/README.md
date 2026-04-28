## Subset II | Print All Unique Subsets

### Problem Statement
Given an integer array nums that may contain duplicates, return all possible unique subsets (power set).  
The solution must not contain duplicate subsets.

---

### Examples

Example 1

Input:  
nums = [1,2,2]

Output:  
[[], [1], [1,2], [1,2,2], [2], [2,2]]

Explanation:  
Duplicate subsets like [1,2] are included only once.

---

Example 2

Input:  
nums = [1]

Output:  
[[], [1]]

Explanation:  
Only two subsets are possible.

---

### Approach

Use backtracking with sorting to avoid duplicates.

---

### Algorithm

1. Sort the array so duplicates are adjacent.  
2. Initialize an empty list to store results.  
3. Define a recursive function with parameters (index, current_subset).  
4. Add the current subset to the result.  
5. Iterate from index to end:
   - If i > index and nums[i] == nums[i-1], skip the element.  
   - Include nums[i] in the subset.  
   - Recurse with index i + 1.  
   - Backtrack by removing the last element.  
6. Return all unique subsets.

---

### Author
- Rohit
