## Problem Statement
You are given an array of integers `arr[]`. You have to **reverse the array in place**.

---

## Examples

### Example 1
**Input:**  
`arr = [1, 4, 3, 2, 6, 5]`  

**Output:**  
`[5, 6, 2, 3, 4, 1]`  

**Explanation:**  
The array after reversing becomes `[5, 6, 2, 3, 4, 1]`.

---

### Example 2
**Input:**  
`arr = [4, 5, 2]`  

**Output:**  
`[2, 5, 4]`  

---

### Example 3
**Input:**  
`arr = [1]`  

**Output:**  
`[1]`  

---

## Constraints
- `1 ≤ arr.size() ≤ 10^5`  
- `0 ≤ arr[i] ≤ 10^5`  

---

## Approach
1. Use two pointers:  
   - One starting at the beginning (`left`)  
   - One starting at the end (`right`)  
2. Swap elements at `left` and `right`.  
3. Move `left++` and `right--` until they meet.  
4. The array is reversed in place without extra space.  

---

## Complexity
- **Time Complexity:** O(n) (single traversal)  
- **Space Complexity:** O(1) (in-place reversal)  

---
