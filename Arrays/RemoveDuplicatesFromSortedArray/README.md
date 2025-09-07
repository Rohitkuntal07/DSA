# Remove Duplicates from Sorted Array

## Problem Statement
Given a sorted array `arr[]` of size `n`, the goal is to rearrange the array so that all **distinct elements** appear at the beginning in sorted order. Additionally, return the **length of this distinct sorted subarray**.

> **Note:** The elements after the distinct ones can be in any order and hold any value, as they don't affect the result.

---

## Examples

### Example 1
**Input:**  
arr = [2, 2, 2, 2, 2]<br>

**Output:**  
[2]<br>
**Explanation:**  
All elements are `2`, so only one instance of `2` remains.

---

### Example 2
**Input:**  
arr = [1, 2, 2, 3, 4, 4, 4, 5, 5]<br>

**Output:**  
[1, 2, 3, 4, 5]<br>


---

### Example 3
**Input:**  
arr = [1, 2, 3]<br>

**Output:**  
[1, 2, 3]<br>

---

## Approach
- Use a **HashSet** to track seen elements.  
- Traverse the array and add each element if it’s not already present.  
- Place unique elements at the front of the array and return the new length.  

This ensures all unique values are kept in order.

---

### Author
Rohit
