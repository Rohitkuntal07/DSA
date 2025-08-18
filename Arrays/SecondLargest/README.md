## Problem Statement
Given an array of positive integers `arr[]`, return the **second largest element** from the array.  
If the second largest element doesn't exist, return `-1`.

**Note:** The second largest element should not be equal to the largest element.

---

## Examples

### Example 1
**Input:**  
`arr = [12, 35, 1, 10, 34, 1]`  

**Output:**  
`34`  

**Explanation:**  
The largest element is `35`, and the second largest element is `34`.

---

### Example 2
**Input:**  
`arr = [10, 5, 10]`  

**Output:**  
`5`  

**Explanation:**  
The largest element is `10`, and the second largest element is `5`.

---

### Example 3
**Input:**  
`arr = [10, 10, 10]`  

**Output:**  
`-1`  

**Explanation:**  
The largest element is `10`, and no distinct second largest element exists.

---

## Constraints
- `2 ≤ arr.size() ≤ 10^5`  
- `1 ≤ arr[i] ≤ 10^5`  

---

## Approach
1. Initialize two variables: `first` (largest) and `second` (second largest).  
2. Traverse the array:
   - If the current element is greater than `first`, update `second = first`, then `first = current`.  
   - Else if the current element is smaller than `first` but greater than `second`, update `second = current`.  
3. If `second` is not updated, return `-1`.  
4. Otherwise, return `second`.  

---

## Complexity
- **Time Complexity:** O(n) (single pass over array)  
- **Space Complexity:** O(1)  

---
