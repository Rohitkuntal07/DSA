# Search in a Sorted 2D Matrix

## Problem Statement
You are given a 2D array `mat` of size **N x M**, where:

- Each row is sorted in **non-decreasing** order.
- The **first element** of each row is **greater** than the **last element** of the previous row.

This means the entire matrix behaves like a **sorted 1D array**.

Given an integer `target`, determine whether it exists in the matrix.

---

## Examples

### Example 1
**Input:**  
mat = [  
 [1, 2, 3, 4],  
 [5, 6, 7, 8],  
 [9, 10, 11, 12]  
]  
target = 8  

**Output:**  
True  

**Explanation:**  
The target **8** is found at index **(1, 3)**.

---

### Example 2
**Input:**  
mat = [  
 [1, 2, 4],  
 [6, 7, 8],  
 [9, 10, 34]  
]  
target = 78  

**Output:**  
False  

**Explanation:**  
The target **78** does not exist in the matrix.

---

### Author
Rohit
