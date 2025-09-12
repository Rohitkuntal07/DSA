# Linear Search Algorithm

## Introduction
Linear Search is one of the simplest searching algorithms.  
It works by sequentially checking each element in the array until the target element is found or the end of the array is reached.

---

## Approach
1. Start from the first element of the array.
2. Compare the current element with the target element.
3. If the element matches the target, return the index (or "found").
4. If not, move to the next element.
5. Continue until the element is found or the entire array is traversed.
6. If the element is not present in the array, return -1 (or "not found").

---

## Time Complexity
- **Best Case:** `O(1)` → When the element is found at the first position.
- **Worst Case:** `O(n)` → When the element is not present or found at the last position.
- **Average Case:** `O(n)` → On average, half the elements are checked.

## Space Complexity
- **O(1)** → No extra space is used apart from a few variables.
---
## Examples

### Example 1
**Input:**  
arr = [10, 20, 30, 40, 50], target = 30  

**Process:**  
- Compare 10 with 30 → not equal  
- Compare 20 with 30 → not equal  
- Compare 30 with 30 → found at index 2  

**Output:**  
`Element found at index 2`

---

### Example 2
**Input:**  
arr = [5, 15, 25, 35, 45], target = 50  

**Process:**  
- Compare each element → no match found  

**Output:**  
`Element not found`

---

### Example 3
**Input:**  
arr = [7, 14, 21, 28, 35], target = 7  

**Process:**  
- Compare 7 with 7 → found at index 0  

**Output:**  
`Element found at index 0`

---

### Author 
Rohit
