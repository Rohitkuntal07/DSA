## Print All Divisors of a Given Number

### Problem Statement
Given an integer N, return all divisors of N.

A divisor of N is a positive integer that divides N exactly without leaving a remainder.

---

### Examples

Example 1

Input:  
N = 36

Output:  
[1, 2, 3, 4, 6, 9, 12, 18, 36]

Explanation:  
All numbers that divide 36 completely are its divisors.

---

Example 2

Input:  
N = 12

Output:  
[1, 2, 3, 4, 6, 12]

Explanation:  
All numbers that divide 12 completely are its divisors.

---

### Approach

Use the property that divisors occur in pairs around √N.

If d divides N, then N / d is also a divisor.

---

### Algorithm

1. Initialize an empty list to store divisors.  

2. Iterate from i = 1 to √N:
   - If N % i == 0:
     - Add i to the list.  
     - If i != N / i:
       - Add N / i to the list.  

3. Sort the list of divisors.  

4. Return the sorted list.

---

### Author
- Rohit
