## Implement Pow(x, n)

### Problem Statement
Implement the function pow(x, n) which calculates x raised to the power n.

---

### Examples

Example 1

Input:  
x = 2.0000, n = 10

Output:  
1024.0000

Explanation:  
2^10 = 1024

---

Example 2

Input:  
x = 2.0000, n = -2

Output:  
0.2500

Explanation:  
2^(-2) = 1 / (2^2) = 1 / 4 = 0.25

---

### Approach

Use Binary Exponentiation (fast power) to reduce time complexity.

---

### Algorithm

1. If n == 0, return 1.  
2. If n < 0, compute power for -n and take reciprocal.  
3. If n is even:
   - Compute power(x * x, n / 2).  
4. If n is odd:
   - Compute x * power(x, n - 1).  
5. Return the result.

---

### Author
- Rohit
