## Generate Parentheses

### Problem Statement
Given n pairs of parentheses, generate all combinations of well-formed parentheses.

---

### Examples

Example 1

Input:  
n = 3

Output:  
["((()))", "(()())", "(())()", "()(())", "()()()"]

---

Example 2

Input:  
n = 1

Output:  
["()"]

---

### Approach

Use recursion (backtracking) to build valid parentheses combinations.

---

### Algorithm

1. Start with an empty string curr = "".  
2. Initialize counters open = 0 and close = 0.  
3. If open < n, add '(' and recurse.  
4. If close < open, add ')' and recurse.  
5. If curr.length == 2 * n, add it to the result.  
6. Return all valid combinations.

---

### Author
- Rohit
