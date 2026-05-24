## Implement Pow(x, n)

### Problem Statement
Implement the function pow(x, n) that calculates x raised to the power n.

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

Use Binary Exponentiation (Fast Power) to reduce time complexity from O(n) to O(log n).

---

### Algorithm

1. If n == 0:
   - Return 1 because any number raised to 0 is 1.  

2. If n < 0:
   - Convert n to positive.  
   - Compute power(x, -n).  
   - Return its reciprocal:
     - 1 / result  

3. If n is even:
   - Compute:
     - power(x * x, n / 2)  

4. If n is odd:
   - Compute:
     - x * power(x, n - 1)  

5. Return the final result.

---

### Time Complexity

- O(log n)

### Space Complexity

- O(log n) due to recursion stack.

---

### Author
- Rohit
