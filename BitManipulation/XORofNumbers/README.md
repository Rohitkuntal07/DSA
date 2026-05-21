## Find XOR of Numbers from L to R

### Problem Statement
Given two integers L and R, find the XOR of all numbers in the range [L, R].

---

### Examples

Example 1

Input:  
L = 3, R = 5

Output:  
2

Explanation:  
3 ^ 4 ^ 5 = 2

---

Example 2

Input:  
L = 1, R = 3

Output:  
0

Explanation:  
1 ^ 2 ^ 3 = 0

---

### Approach

Use the repeating XOR pattern from 1 to n.

Pattern for XOR(1 to n):

- If n % 4 == 0 → result = n  
- If n % 4 == 1 → result = 1  
- If n % 4 == 2 → result = n + 1  
- If n % 4 == 3 → result = 0  

Using this pattern:
XOR(L to R) = XOR(1 to R) ^ XOR(1 to L-1)

---

### Algorithm

1. Create a function xorUpto(n):
   - If n % 4 == 0 → return n  
   - If n % 4 == 1 → return 1  
   - If n % 4 == 2 → return n + 1  
   - If n % 4 == 3 → return 0  

2. Compute:
   - x1 = xorUpto(R)  
   - x2 = xorUpto(L - 1)  

3. Return:
   - x1 ^ x2
  
---

### Author
- Rohit
