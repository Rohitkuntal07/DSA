## Count All Subsequences with Sum K

### Problem Statement
Given an array nums and an integer k, return the number of non-empty subsequences such that the sum of elements in the subsequence equals k.

---

### Examples

Example 1

Input:  
nums = [4, 9, 2, 5, 1], k = 10

Output:  
2

Explanation:  
Valid subsequences are [9, 1] and [4, 5, 1].

---

Example 2

Input:  
nums = [4, 2, 10, 5, 1, 3], k = 5

Output:  
3

Explanation:  
Valid subsequences are [4, 1], [2, 3], and [5].

---

### Approach

Use recursion to explore all possible subsequences.

---

### Algorithm

1. Start from index 0 with current sum = 0.  
2. At each index:
   - Include the element and add it to the sum.  
   - Exclude the element and move ahead.  
3. If the sum becomes equal to k, count it as a valid subsequence.  
4. If the sum exceeds k or end of array is reached, stop that path.  
5. Return the total count from both inclusion and exclusion.

---

### Author
- Rohit
