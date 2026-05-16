## Swap Two Numbers

### Problem Statement
Given two integers a and b, swap them in-place without using a temporary variable.

---

### Examples

Example 1

Input:  
a = 5, b = 10

Output:  
a = 10, b = 5

---

Example 2

Input:  
a = -100, b = -200

Output:  
a = -200, b = -100

---

### Approach

Use the XOR (^) operator to swap values without extra space.

---

### Algorithm

1. Perform:
   - a = a ^ b  

2. Perform:
   - b = a ^ b  
   - This updates b to the original value of a.  

3. Perform:
   - a = a ^ b  
   - This updates a to the original value of b.  

4. The values are now swapped.

---

### XOR Properties Used

- x ^ x = 0  
- x ^ 0 = x

---

### Author
- Rohit
