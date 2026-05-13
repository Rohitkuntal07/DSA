## Check if a Number is Odd or Not

### Problem Statement
Given a non-negative integer n, determine whether it is odd or not.  
Return true if the number is odd, otherwise return false.

A number is odd if it is not divisible by 2.

---

### Examples

Example 1

Input:  
n = 7

Output:  
true

Explanation:  
7 is not divisible by 2, so it is odd.

---

Example 2

Input:  
n = 10

Output:  
false

Explanation:  
10 is divisible by 2, so it is even.

---

### Approach

Use the property that odd numbers leave a remainder when divided by 2.

---

### Algorithm

1. Divide the number by 2 using modulo:
   - n % 2

2. If the remainder is not 0:
   - The number is odd.

3. Otherwise:
   - The number is even.
  
---

### Author
- Rohit
