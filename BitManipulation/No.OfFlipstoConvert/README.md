## Count Number of Bits to be Flipped to Convert A to B

### Problem Statement
Given two integers start and goal, determine the minimum number of bit flips required to convert start into goal.

A bit flip changes a bit from 0 to 1 or from 1 to 0.

---

### Examples

Example 1

Input:  
start = 10, goal = 7

Output:  
3

Explanation:  
Binary of 10 = 1010  
Binary of 7  = 0111  

Three bits are different, so 3 flips are required.

---

Example 2

Input:  
start = 3, goal = 4

Output:  
3

Explanation:  
Binary of 3 = 011  
Binary of 4 = 100  

All three bits are different.

---

### Approach

Use XOR to identify differing bits and count the number of set bits.

---

### Algorithm

1. Compute XOR of start and goal:
   - xor = start ^ goal  

2. XOR sets bits where the two numbers differ.  

3. Count the number of set bits in xor:
   - Each set bit represents one required flip.  

4. Return the count as the minimum number of flips required.

--- 

### Author
- Rohit
