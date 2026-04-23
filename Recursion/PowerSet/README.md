## Power Set: Print All Subsequences of a String

### Problem Statement
Given a string, find all possible subsequences of the string.

---

### Examples

Example 1

Input:  
str = "abc"

Output:  
[a, ab, abc, ac, b, bc, c]

Explanation:  
The string has 7 subsequences.

---

Example 2

Input:  
str = "aa"

Output:  
[a, a, aa]

Explanation:  
The string has 3 subsequences.

---

### Approach

Use recursion to generate all subsequences by making include/exclude decisions.

---

### Algorithm

1. Start with an empty subsequence.  
2. For each character:
   - Include it in the subsequence and recurse.  
   - Exclude it and recurse.  
3. When the end of the string is reached, store the current subsequence.  
4. Return all generated subsequences.

---

### Author
- Rohit
