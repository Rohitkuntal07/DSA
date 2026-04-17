## Count Good Numbers

### Problem Statement
A digit string is considered good if:
- Digits at even indices (0-based) are even digits (0, 2, 4, 6, 8)
- Digits at odd indices are prime digits (2, 3, 5, 7)

Given an integer n, return the total number of good digit strings of length n.  
Return the result modulo 10^9 + 7.

---

### Examples

Example 1

Input:  
n = 1

Output:  
5

Explanation:  
Index 0 must have an even digit.  
Valid options: 0, 2, 4, 6, 8

---

Example 2

Input:  
n = 2

Output:  
20

Explanation:  
Index 0 → 5 options (even digits)  
Index 1 → 4 options (prime digits)  
Total = 5 * 4 = 20

---

### Approach

Count choices for even and odd positions and use fast exponentiation.

---

### Algorithm

1. Count even positions = (n + 1) / 2  
2. Count odd positions = n / 2  
3. Total ways = (5 ^ even_positions) * (4 ^ odd_positions)  
4. Use fast power (binary exponentiation) to compute powers efficiently.  
5. Return result modulo 10^9 + 7.

---

### Author
- Rohit
