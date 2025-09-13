# Bubble Sort

## Approach
Bubble Sort is a simple comparison-based sorting algorithm.  
It repeatedly traverses the array, compares adjacent elements, and swaps them if they are in the wrong order.  
This process continues until the array is sorted.  
With each pass, the largest element "bubbles up" to the end of the array.

### Steps:
1. Start from the first element and compare it with the next.
2. If the first element is greater than the next, swap them.
3. Move to the next pair and repeat the process until the end of the array.
4. Repeat the entire pass for `n-1` times, where `n` is the size of the array.
5. After each pass, the largest element is placed at its correct position at the end.

---

## Time Complexity
- **Best Case:** O(n) → when the array is already sorted (optimized version with early exit).
- **Average Case:** O(n²)  
- **Worst Case:** O(n²) → when the array is in reverse order.

## Space Complexity
- **O(1)** → Bubble Sort is an in-place sorting algorithm.

---

## Example 1
**Input:**  
`[64, 25, 12, 22, 11]`  

**Process:**  
- Pass 1: `[25, 12, 22, 11, 64]`  
- Pass 2: `[12, 22, 11, 25, 64]`  
- Pass 3: `[12, 11, 22, 25, 64]`  
- Pass 4: `[11, 12, 22, 25, 64]`  

**Output:**  
`[11, 12, 22, 25, 64]`

---

## Example 2
**Input:**  
`[5, 1, 4, 2, 8]`  

**Output:**  
`[1, 2, 4, 5, 8]`

---
### Author 
Rohit
