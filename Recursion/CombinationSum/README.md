## Combination Sum - 1

### Problem Statement
Given an array of distinct integers and a target, return all unique combinations where the chosen numbers sum to the target.  
The same number may be chosen multiple times.

---

### Examples

Example 1

Input:  
array = [2, 3, 6, 7], target = 7

Output:  
[[2,2,3], [7]]

Explanation:  
2 + 2 + 3 = 7  
7 = 7

---

Example 2

Input:  
array = [2], target = 1

Output:  
[]

Explanation:  
No combination sums to the target.

---

### Approach

Use recursion and backtracking with the pick / not-pick strategy.

---

### Algorithm

1. Start from index 0 with an empty list.  
2. If target == 0, add the current combination to the result.  
3. If index reaches the end of array or target < 0, return.  
4. Pick the current element:
   - Add it to the current list.  
   - Reduce target by its value.  
   - Stay on the same index (since reuse is allowed).  
5. Backtrack by removing the element.  
6. Do not pick the current element:
   - Move to the next index.  
7. Repeat until all combinations are explored.

---

### Author
- Rohit
