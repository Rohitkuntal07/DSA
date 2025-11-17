# Kadane's Algorithm : Maximum Subarray Sum in an Array

## 📌 Problem Statement  
Given an integer array `arr`, find the contiguous subarray (containing at least one number)  
which has the **largest sum**, and return its **sum** and **print the subarray**.

---

## 🔍 Examples

### **Example 1**
**Input:**  
`arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`

**Output:**  
`6`

**Explanation:**  
The subarray `[4, -1, 2, 1]` has the largest sum **6**.

---

### **Example 2**
**Input:**  
`arr = [1]`

**Output:**  
`1`

**Explanation:**  
Array has only one element, and it gives a positive sum of **1**.

---

## 🚀 Kadane's Algorithm (Approach)

Kadane’s Algorithm efficiently finds the maximum subarray sum in **O(n)** time.

1. Initialize:
   - `currentSum = 0`  
   - `maxSum = -∞`
2. Traverse each element:
   - Add element to `currentSum`
   - If `currentSum` becomes negative → reset to 0
   - Track maximum value in `maxSum`
3. Keep track of start & end indices to print the actual subarray.

---

### Author
Rohit
