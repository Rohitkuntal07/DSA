## Subset Sum : Sum of All Subsets

### Problem Statement
Given an array, print the sum of all subsets in increasing order.

---

### Examples

Example 1

Input:  
N = 3, arr = {5, 2, 1}

Output:  
0, 1, 2, 3, 5, 6, 7, 8

Explanation:  
All subset sums are generated and sorted.

---

Example 2

Input:  
N = 3, arr = {3, 1, 2}

Output:  
0, 1, 2, 3, 3, 4, 5, 6

Explanation:  
All subset sums are generated and sorted.

---

### Approach

Use recursion to generate all subset sums.

---

### Algorithm

1. Initialize an empty list to store sums.  
2. Define a recursive function with parameters (index, current_sum).  
3. If index == N:
   - Add current_sum to the result list.  
   - Return.  
4. Include the current element:
   - Call function(index + 1, current_sum + arr[index]).  
5. Exclude the current element:
   - Call function(index + 1, current_sum).  
6. After recursion, sort the result list.  
7. Return or print the sorted sums.

---

### Author
- Rohit
