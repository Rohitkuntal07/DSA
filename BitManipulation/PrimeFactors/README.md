## Print Prime Factors of a Number

### Problem Statement
Given an integer array queries, return the prime factorization of each number in sorted order.

---

### Examples

Example 1

Input:  
queries = [2, 3, 4, 5, 6]

Output:  
[[2], [3], [2,2], [5], [2,3]]

Explanation:  
- 2, 3, and 5 are prime numbers.  
- 4 = 2 × 2  
- 6 = 2 × 3  

---

Example 2

Input:  
queries = [7, 12, 18]

Output:  
[[7], [2,2,3], [2,3,3]]

Explanation:  
- 7 is prime.  
- 12 = 2 × 2 × 3  
- 18 = 2 × 3 × 3  

---

### Approach

Use the Smallest Prime Factor (SPF) sieve to factorize numbers efficiently.

---

### Algorithm

1. Precompute the Smallest Prime Factor (SPF) for all numbers up to the maximum query value using Sieve of Eratosthenes.  

2. Initialize:
   - spf[i] = i for every number.  

3. For every number from 2 onward:
   - If the number is prime:
     - Mark its multiples with the smallest prime factor.  

4. For each query number:
   - Repeatedly divide the number by its SPF.  
   - Store each SPF in the result list.  

5. Continue until the number becomes 1.  

6. Return all factorization lists.

---

### Author
- Rohit
