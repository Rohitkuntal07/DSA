## Combination Sum III

### Problem Statement
Find all possible combinations of k numbers that add up to n such that:
- Only numbers from 1 to 9 are used  
- Each number is used at most once  
- No duplicate combinations are allowed  

---

### Examples

Example 1

Input:  
k = 3, n = 7

Output:  
[[1, 2, 4]]

Explanation:  
1 + 2 + 4 = 7

---

Example 2

Input:  
k = 3, n = 9

Output:  
[[1, 2, 6], [1, 3, 5], [2, 3, 4]]

Explanation:  
All combinations of 3 numbers from 1 to 9 that sum to 9.

---

### Approach

Use backtracking to generate combinations and prune invalid paths.

---

### Algorithm

1. Start with numbers from 1 to 9.  
2. Use a recursive function with parameters (start, k, target, current_list).  
3. If target == 0 and size of current_list == k:
   - Add the combination to the result.  
4. If target < 0 or size exceeds k, return.  
5. Iterate from current number to 9:
   - Include the number in the list.  
   - Recurse with next number and reduced target.  
   - Backtrack by removing the number.  
6. Return all valid combinations.

---

### Author
- Rohit
