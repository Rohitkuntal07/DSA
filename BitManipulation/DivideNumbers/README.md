## Divide Two Integers Without Using Multiplication, Division and Mod Operator

### Problem Statement
Given two integers dividend and divisor, divide them without using multiplication (*), division (/), or modulus (%) operators.

Return the quotient after truncating the fractional part toward zero.

If the result exceeds the 32-bit signed integer range:
- Return 2^31 - 1 if overflow occurs on the positive side.
- Return -2^31 if overflow occurs on the negative side.

---

### Examples

Example 1

Input:  
dividend = 10, divisor = 3

Output:  
3

Explanation:  
10 / 3 = 3.33, truncated to 3.

---

Example 2

Input:  
dividend = 7, divisor = -3

Output:  
-2

Explanation:  
7 / -3 = -2.33, truncated to -2.

---

### Approach

Use bit manipulation and repeated subtraction with powers of two.

---

### Algorithm

1. Determine the sign of the result:
   - Negative if dividend and divisor have opposite signs.  

2. Convert both numbers to positive using absolute values.  

3. Initialize quotient = 0.  

4. While dividend >= divisor:
   - Initialize temp = divisor and multiple = 1.  
   - Double temp and multiple using left shift until:
     - (temp << 1) > dividend  

5. Subtract temp from dividend.  

6. Add multiple to quotient.  

7. Repeat until dividend < divisor.  

8. Apply the correct sign to the quotient.  

9. Clamp the result within 32-bit integer range:
   - [-2^31, 2^31 - 1]

10. Return the quotient.

---

### Author
- Rohit
