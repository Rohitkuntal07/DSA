## Generate All Binary Strings

### Problem Statement
Given an integer n, return all binary strings of length n that do not contain consecutive 1s.  
Return the result in lexicographically increasing order.

A binary string consists only of characters '0' and '1'.

---

### Examples

Example 1

Input:  
n = 3

Output:  
["000", "001", "010", "100", "101"]

Explanation:  
All binary strings of length 3 without consecutive 1s.

---

Example 2

Input:  
n = 2

Output:  
["00", "01", "10"]

Explanation:  
All binary strings of length 2 without consecutive 1s.

---

### Approach

Use recursion (backtracking) to build strings while ensuring no consecutive 1s.

---

### Algorithm

1. Start with an empty string.  
2. At each step:
   - Always add '0' and recurse.  
   - Add '1' only if the previous character is not '1'.  
3. Continue until the string length becomes n.  
4. Add the valid string to the result.  
5. Return all generated strings.

---

### Author
- Rohit
