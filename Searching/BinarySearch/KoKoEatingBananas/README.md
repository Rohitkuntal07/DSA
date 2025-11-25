# Koko Eating Bananas 🍌

## Problem Statement
Koko is given **n** piles of bananas, where the *i-th* pile has `a[i]` bananas.  
She also has **h** hours to finish eating all the bananas.

Each hour, she chooses one non-empty pile and eats **k bananas**.  
If a pile has fewer than `k` bananas, she eats all remaining bananas (and the rest of that hour is wasted).

Your task is to **find the minimum integer k** such that Koko can eat all piles within **h** hours.

---

## Examples

### Example 1
**Input:**  
N = 4  
a[] = {7, 15, 6, 3}  
h = 8  

**Output:**  
5  

**Explanation:**  
If Koko eats **5 bananas/hour**, she needs:  
- ceil(7/5) = 2 hours  
- ceil(15/5) = 3 hours  
- ceil(6/5) = 2 hours  
- ceil(3/5) = 1 hour  
Total = 8 hours → valid.

---

### Example 2
**Input:**  
N = 5  
a[] = {25, 12, 8, 14, 19}  
h = 5  

**Output:**  
25  

**Explanation:**  
Eating **25 bananas/hour**, each pile takes 1 hour → total 5 hours.


---  

### Author
Rohit
