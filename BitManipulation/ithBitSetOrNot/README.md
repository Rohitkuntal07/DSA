## Check if the i-th Bit is Set or Not

### Problem Statement
Given two integers n and i, determine whether the i-th bit in the binary representation of n is set (1) or not.  
Bits are counted from the Least Significant Bit (LSB) using 0-based indexing.

---

### Examples

Example 1

Input:  
n = 5, i = 0

Output:  
true

Explanation:  
Binary representation of 5 is 101.  
The 0-th bit from LSB is 1.

---

Example 2

Input:  
n = 10, i = 1

Output:  
true

Explanation:  
Binary representation of 10 is 1010.  
The 1-st bit from LSB is 1.

---

### Approach

Use bit masking to isolate and check the i-th bit.

---

### Algorithm

1. Create a mask by shifting 1 left by i positions:
   - mask = (1 << i)

2. Perform bitwise AND between n and mask:
   - result = n & mask

3. If result is not 0:
   - The i-th bit is set (1)

4. Otherwise:
   - The i-th bit is not set (0)

---

### Author
- Rohit
