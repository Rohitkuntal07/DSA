## Combination Sum II - Find All Unique Combinations

### Problem Statement
Given an array of integers candidates and a target, return all unique combinations where the chosen numbers sum to the target.  
Each number may be used only once in a combination.

---

### Examples

Example 1

Input:  
candidates = [10,1,2,7,6,1,5], target = 8

Output:  
[[1,1,6], [1,2,5], [1,7], [2,6]]

Explanation:  
These are all unique combinations that sum to the target.

---

Example 2

Input:  
candidates = [2,5,2,1,2], target = 5

Output:  
[[1,2,2], [5]]

Explanation:  
These are all unique combinations that sum to the target.

---

### Approach

Use recursion and backtracking with sorting to avoid duplicates.

---

### Algorithm

1. Sort the array to handle duplicates.  
2. Start recursion from index 0 with an empty list.  
3. If target == 0, add the current combination to the result.  
4. Iterate from current index to end:
   - Skip duplicate elements (if i > index and arr[i] == arr[i-1]).  
   - If arr[i] > target, break the loop.  
   - Include arr[i] in the combination.  
   - Recurse with next index (i + 1) and reduced target.  
   - Backtrack by removing the element.  
5. Return all valid combinations.

---

### Author
- Rohit
