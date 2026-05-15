## Count the Number of Set Bits

### Problem Statement
Given an integer n, return the number of set bits (1s) in its binary representation.

The solution should work in O(log n) time complexity.

---

### Examples

Example 1

Input:  
n = 5

Output:  
2

Explanation:  
Binary representation of 5 is 101, which contains 2 set bits.

---

Example 2

Input:  
n = 15

Output:  
4

Explanation:  
Binary representation of 15 is 1111, which contains 4 set bits.

---

### Approach

Check each bit of the number using bitwise operations.

---

### Algorithm

1. Initialize count = 0.  
2. While n > 0:
   - Check the least significant bit using:
     - n & 1  
   - If result is 1, increment count.  
   - Right shift the number by 1:
     - n = n >> 1  
3. Return count.

---

### Author
- Rohit
